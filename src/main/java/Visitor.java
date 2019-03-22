public class Visitor extends MicroBaseVisitor {

    @Override
    public Object visitProgram(MicroParser.ProgramContext ctx) {
        visitPgm_body(ctx.pgm_body());
        return null;
    }


    @Override
    public Object visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        System.out.println("<<Global Variables>>");
        visit(ctx.decl());
        visit(ctx.func_declarations());
        return null;
    }
    /**         Global Variable Declaration                    */

    //decl start
    @Override
    public Object visitStringDecl(MicroParser.StringDeclContext ctx) {
        visitString_decl(ctx.string_decl());
        visit(ctx.decl());
        return null;
    }


    @Override
    public Object visitVarDecl(MicroParser.VarDeclContext ctx) {
        visitVar_decl(ctx.var_decl());
        visit(ctx.decl());
        return null;
    }

    @Override
    public Object visitNoDecl(MicroParser.NoDeclContext ctx) {
        return null;
    }
    //decl End


    @Override
    public Object visitString_decl(MicroParser.String_declContext ctx) {
        System.out.println("String");
        visitId(ctx.id());
        return null;
    }


    @Override
    public Object visitVar_decl(MicroParser.Var_declContext ctx) {
        visit(ctx.var_type());
        visitId_list(ctx.id_list());
        return null;
    }
    //start var_type
    @Override
    public Object visitFloatKeyWord(MicroParser.FloatKeyWordContext ctx) {
        System.out.println("Float");
        return null;
    }

    @Override
    public Object visitIntKeyWord(MicroParser.IntKeyWordContext ctx) {
        System.out.println("Int");
        return null;
    }
    //end var_type

    @Override
    public Object visitId_list(MicroParser.Id_listContext ctx) {
        visitId(ctx.id());
        visit(ctx.id_tail());
        return  null;
    }

    //start id_tail
    @Override
    public Object visitIDTail(MicroParser.IDTailContext ctx) {
        visitId(ctx.id());
        visit(ctx.id_tail());
        return null;
    }


    @Override
    public Object visitNoTail(MicroParser.NoTailContext ctx) {
        return null;
    }
    //end id_tail

    @Override
    public Object visitId(MicroParser.IdContext ctx) {
        System.out.println(ctx.getText());
        return null;
    }

    /**         Function Declaration                    */

    @Override
    public Object visitFuncDecl(MicroParser.FuncDeclContext ctx) {
        visitFunc_decl(ctx.func_decl());
        visit(ctx.func_declarations());
        return null;
    }

    @Override
    public Object visitFunc_decl(MicroParser.Func_declContext ctx) {
        System.out.println("<< Block :"+ctx.id().getText()+" Params >>");
        visit(ctx.param_decl_list());
        visitFunc_body(ctx.func_body());
        return null;
    }

    /** Function Parameters **/

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

    /**            Function Body                     */

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