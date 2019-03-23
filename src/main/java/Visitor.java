import java.util.*;

public class Visitor extends MicroBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();

    @Override
    public Object visitProgram(MicroParser.ProgramContext ctx) {
        visitPgm_body(ctx.pgm_body());
        return null;
    }


    @Override
    public Object visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        //System.out.println("<<Global Variables>>");
        Map<Object, Object> vars = symbolTable.newScope();
        vars.putAll((Map) visit(ctx.decl()));
        visit(ctx.func_declarations());
        symbolTable.printAllScopesInfo();
        return null;
    }

    /**
     * Global Variable Declaration
     */

    //decl start
    @Override
    public Object visitStringDecl(MicroParser.StringDeclContext ctx) {
        Map map = new HashMap();
        map.putAll((Map) visitString_decl(ctx.string_decl()));
        map.putAll((Map) visit(ctx.decl()));
        return map;
    }


    @Override
    public Object visitVarDecl(MicroParser.VarDeclContext ctx) {
        Map vars= new HashMap();
        vars.putAll((Map) visitVar_decl(ctx.var_decl()));
        vars.putAll((Map)visit(ctx.decl()));
        return vars;
    }

    @Override
    public Object visitNoDecl(MicroParser.NoDeclContext ctx) {
        return new HashMap<>();
    }
    //decl End


    @Override
    public Object visitString_decl(MicroParser.String_declContext ctx) {
        Map vars = new HashMap();
        Object id = visitId(ctx.id());
        vars.put(id, "STRING");
        return vars;
    }


    @Override
    public Object visitVar_decl(MicroParser.Var_declContext ctx) {
        Map vars = new HashMap();
        Object type = visit(ctx.var_type());      //Float | Int
        LinkedList ids= (LinkedList) visitId_list(ctx.id_list());
        for (Object id:ids) {
            vars.put(id,type);
        }
        return vars;
    }

    //start var_type
    @Override
    public Object visitFloatKeyWord(MicroParser.FloatKeyWordContext ctx) {
        //System.out.println("Float");
        return "FLOAT";
    }

    @Override
    public Object visitIntKeyWord(MicroParser.IntKeyWordContext ctx) {
        //System.out.println("Int");
        return "INT";
    }
    //end var_type

    @Override
    public Object visitId_list(MicroParser.Id_listContext ctx) {
        LinkedList list = new LinkedList();
        list.add(visitId(ctx.id()));        //a
        list.addAll((Collection) visit(ctx.id_tail()));
        return list;
    }

    //start id_tail
    @Override
    public Object visitIDTail(MicroParser.IDTailContext ctx) {
        LinkedList list=new LinkedList();
        list.add(visitId(ctx.id()));//b
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
        System.out.println("<< Block :" + ctx.id().getText() + " Params >>");
        visit(ctx.param_decl_list());
        visitFunc_body(ctx.func_body());
        return null;
    }

    /**
     * Function Parameters
     **/

    @Override
    public Object visitParamDeclList(MicroParser.ParamDeclListContext ctx) {
        visitParam_decl(ctx.param_decl());
        visit(ctx.param_decl_tail());
        return null;
    }

    @Override
    public Object visitParam_decl(MicroParser.Param_declContext ctx) {
        visit(ctx.var_type());
        visitId(ctx.id());
        return null;
    }

    //start param_decl_tail

    @Override
    public Object visitParamDeclTail(MicroParser.ParamDeclTailContext ctx) {
        visitParam_decl(ctx.param_decl());
        visit(ctx.param_decl_tail());
        return null;
    }

    @Override
    public Object visitNoParamTail(MicroParser.NoParamTailContext ctx) {
        return null;
    }
    //end param_decl_tail

    @Override
    public Object visitNoParamList(MicroParser.NoParamListContext ctx) {
        return null;
    }

    @Override
    public Object visitNoFuncDecl(MicroParser.NoFuncDeclContext ctx) {
        return null;
    }

    /**
     * Function Body
     */

    @Override
    public Object visitFunc_body(MicroParser.Func_bodyContext ctx) {
        System.out.println("<< Block : Variables >>");
        visit(ctx.decl());
        visit(ctx.stmt_list());
        return null;
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
        return null;
    }
    //end stmt_list

    //start stmt
    @Override
    public Object visitBasicStatment(MicroParser.BasicStatmentContext ctx) {
        //visit(ctx.basic_stmt());
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

    //start basic_stmt

    //end basic_stmt

    //start if_stmt
    @Override
    public Object visitIf_stmt(MicroParser.If_stmtContext ctx) {
        System.out.println("<< Block : Variables >>");
        visit(ctx.decl());
        visit(ctx.stmt_list());
        visit(ctx.else_part());
        return null;
    }

    @Override
    public Object visitElsePart(MicroParser.ElsePartContext ctx) {
        System.out.println("<< Block : Variables >>");
        visit(ctx.decl());
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
        System.out.println("<< Block : Variables >>");
        visit(ctx.decl());
        visit(ctx.stmt_list());
        return null;
    }
    //end for_stmt
}

/*
    INT a, b , c , d;
	FLOAT dummy1,dummy2;
	INT z,x,y,w;
	STRING name :="Osama";
	FLOAT  dummy3,dummy4;

* */