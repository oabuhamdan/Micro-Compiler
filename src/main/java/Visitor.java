import java.util.*;

public class Visitor extends MicroBaseVisitor {

    private static SymbolTable symbolTable = new SymbolTable();
    private int count = 0;

    public static SymbolTable getSymbolTable() {

        return symbolTable;
    }

    @Override
    public Object visitProgram(MicroParser.ProgramContext ctx) {
        visitPgm_body(ctx.pgm_body());
        return null;
    }

    @Override
    public Object visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        Map<Object, Object> vars = symbolTable.newScope();      //Global Scope
        symbolTable.setName("Global Scope");
        vars.putAll((Map) visit(ctx.decl()));       //Global Variables
        visit(ctx.func_declarations());             //Functions
        return null;
    }

    /**
     * Global Variable Declaration
     */
    //decl start
    @Override
    public Object visitStringDecl(MicroParser.StringDeclContext ctx) {
        Map vars = new LinkedHashMap();
        vars.putAll((Map) visitString_decl(ctx.string_decl()));
        vars.putAll((Map) visit(ctx.decl()));
        return vars;
    }

    @Override
    public Object visitVarDecl(MicroParser.VarDeclContext ctx) {
        Map vars = new LinkedHashMap();
        vars.putAll((Map) visitVar_decl(ctx.var_decl()));
        vars.putAll((Map) visit(ctx.decl()));
        return vars;
    }

    @Override
    public Object visitNoDecl(MicroParser.NoDeclContext ctx) {
        return new LinkedHashMap<>();
    }
    //decl End

    @Override
    public Object visitString_decl(MicroParser.String_declContext ctx) {
        Map vars = new LinkedHashMap();
        Object id = visitId(ctx.id());
        vars.put(id, "STRING" + " : " + ctx.str().getText());
        return vars;
    }

    @Override
    public Object visitVar_decl(MicroParser.Var_declContext ctx) {
        Map vars = new LinkedHashMap();
        Object type = visit(ctx.var_type());      //Float | Int
        LinkedList ids = (LinkedList) visitId_list(ctx.id_list());
        for (Object id : ids) {
            vars.put(id, type);
        }
        return vars;
    }

    //start var_type
    @Override
    public Object visitFloatKeyWord(MicroParser.FloatKeyWordContext ctx) {
        return "FLOAT";
    }

    @Override
    public Object visitIntKeyWord(MicroParser.IntKeyWordContext ctx) {
        return "INT";
    }
    //end var_type

    @Override
    public Object visitId_list(MicroParser.Id_listContext ctx) {
        LinkedList list = new LinkedList();
        list.add(visitId(ctx.id()));
        list.addAll((Collection) visit(ctx.id_tail()));
        return list;
    }

    //start id_tail
    @Override
    public Object visitIDTail(MicroParser.IDTailContext ctx) {
        LinkedList list = new LinkedList();
        list.add(visitId(ctx.id()));
        list.addAll((Collection) visit(ctx.id_tail()));
        return list;
    }

    @Override
    public Object visitNoTail(MicroParser.NoTailContext ctx) {
        return new LinkedList<>();
    }
    //end id_tail

    @Override
    public Object visitId(MicroParser.IdContext ctx) {
        return ctx.getText();
    }

    /**
     * Function Declaration
     */

    @Override
    public Object visitFuncDecl(MicroParser.FuncDeclContext ctx) {
        visitFunc_decl(ctx.func_decl());
        visit(ctx.func_declarations());
        return null;
    }

    @Override
    public Object visitFunc_decl(MicroParser.Func_declContext ctx) {
        Map<Object, Object> vars = symbolTable.newScope();      //Function Variables
        symbolTable.setName(ctx.id().getText());
        vars.putAll((Map) visit(ctx.param_decl_list()));
        vars.putAll((Map) visitFunc_body(ctx.func_body()));
        return null;
    }

    /**
     * Function Parameters
     **/
    @Override
    public Object visitParam_decl(MicroParser.Param_declContext ctx) {
        Map vars = new LinkedHashMap();
        Object type = visit(ctx.var_type());
        Object id = visitId(ctx.id());
        vars.put(id, type);
        return vars;
    }

    @Override
    public Object visitParamDeclList(MicroParser.ParamDeclListContext ctx) {
        return paramListVisitor(ctx.param_decl(), ctx.param_decl_tail());
    }
    //start param_decl_tail

    @Override
    public Object visitParamDeclTail(MicroParser.ParamDeclTailContext ctx) {
        return paramListVisitor(ctx.param_decl(), ctx.param_decl_tail());
    }

    @Override
    public Object visitNoParamTail(MicroParser.NoParamTailContext ctx) {
        return new LinkedHashMap<>();
    }
    //end param_decl_tail

    @Override
    public Object visitNoParamList(MicroParser.NoParamListContext ctx) {
        return new LinkedHashMap<>();
    }

    @Override
    public Object visitNoFuncDecl(MicroParser.NoFuncDeclContext ctx) {
        return new LinkedHashMap<>();
    }

    /**
     * Function Body
     */
    @Override
    public Object visitFunc_body(MicroParser.Func_bodyContext ctx) {
        Map vars = (Map) visit(ctx.decl());     //Func Variable
        visit(ctx.stmt_list());
        return vars;
    }

    //start stmt_list
    @Override
    public Object visitStatmnetList(MicroParser.StatmnetListContext ctx) {
        visit(ctx.stmt());
        visit(ctx.stmt_list());
        return null;
    }

    @Override
    public Object visitNoStatmnetList(MicroParser.NoStatmnetListContext ctx) {
        return new LinkedHashMap<>();
    }
    //end stmt_list

    //start stmt
    @Override
    public Object visitBasicStatment(MicroParser.BasicStatmentContext ctx) {
        return null;
    }

    @Override
    public Object visitIfStatment(MicroParser.IfStatmentContext ctx) {
        visitIf_stmt(ctx.if_stmt());
        return null;
    }

    @Override
    public Object visitForStatment(MicroParser.ForStatmentContext ctx) {
        visitFor_stmt(ctx.for_stmt());
        return null;
    }
    //end stmt

    //start if_stmt
    @Override
    public Object visitIf_stmt(MicroParser.If_stmtContext ctx) {
        Map ifScope = symbolTable.newScope();
        symbolTable.setName("Block #" + ++count);
        ifScope.putAll((Map) visit(ctx.decl()));
        visit(ctx.stmt_list());
        visit(ctx.else_part());
        return null;
    }

    @Override
    public Object visitElsePart(MicroParser.ElsePartContext ctx) {
        Map elseScope = symbolTable.newScope();
        symbolTable.setName("Block #" + ++count);
        elseScope.putAll((Map) visit(ctx.decl()));
        visit(ctx.stmt_list());
        return null;
    }

    @Override
    public Object visitNoElsePart(MicroParser.NoElsePartContext ctx) {
        return null;
    }
    //end if_stmt

    //start for_stmt
    @Override
    public Object visitFor_stmt(MicroParser.For_stmtContext ctx) {
        Map forScope = symbolTable.newScope();
        symbolTable.setName("Block #" + ++count);
        forScope.putAll((Map) visit(ctx.decl()));
        visit(ctx.stmt_list());
        return null;
    }
    //end for_stmt

    private Object paramListVisitor(MicroParser.Param_declContext param_declContext, MicroParser.Param_decl_tailContext param_decl_tailContext) {
        Map vars = new LinkedHashMap();
        vars.putAll((Map) visitParam_decl(param_declContext));
        vars.putAll((Map) visit(param_decl_tailContext));
        return vars;
    }
}