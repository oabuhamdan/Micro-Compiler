public class Visitor extends MicroBaseVisitor {

    @Override
    public Object visitProgram(MicroParser.ProgramContext ctx) {
        visitPgm_body(ctx.pgm_body());
        return null;
    }


    @Override
    public Object visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        visit(ctx.decl());
        visit(ctx.func_declarations());
        return null;
    }


    @Override
    public Object visitFuncDecl(MicroParser.FuncDeclContext ctx) {
        visitFunc_decl(ctx.func_decl());
        visit(ctx.func_declarations());
        return null;
    }


    @Override
    public Object visitNoFuncDecl(MicroParser.NoFuncDeclContext ctx) {
        return null;
    }


    @Override
    public Object visitFunc_decl(MicroParser.Func_declContext ctx) {
        visit(ctx.param_decl_list());
        visitFunc_body(ctx.func_body());
        return null;
    }


    @Override
    public Object visitParamDeclList(MicroParser.ParamDeclListContext ctx) {
        visitParam_decl(ctx.param_decl());
        visit(ctx.param_decl_tail());
        return null;
    }


    @Override
    public Object visitParamDeclTail(MicroParser.ParamDeclTailContext ctx) {
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


    @Override
    public Object visitNoParamTail(MicroParser.NoParamTailContext ctx) {
        return null;
    }


    @Override
    public Object visitNoParamList(MicroParser.NoParamListContext ctx) {
        return null;
    }

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
}