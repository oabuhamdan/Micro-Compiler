public class Visitor extends MicroBaseVisitor {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitProgram(MicroParser.ProgramContext ctx) {
        visitPgm_body(ctx.pgm_body());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        visit(ctx.decl());
        visit(ctx.func_declarations());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitFuncDecl(MicroParser.FuncDeclContext ctx) {
        visitFunc_decl(ctx.func_decl());
        visit(ctx.func_declarations());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitNoFuncDecl(MicroParser.NoFuncDeclContext ctx) {
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitFunc_decl(MicroParser.Func_declContext ctx) {
        visit(ctx.param_decl_list());
        visitFunc_body(ctx.func_body());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitStringDecl(MicroParser.StringDeclContext ctx) {
        visitString_decl(ctx.string_decl());
        visit(ctx.decl());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitVarDecl(MicroParser.VarDeclContext ctx) {
        visitVar_decl(ctx.var_decl());
        visit(ctx.decl());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitString_decl(MicroParser.String_declContext ctx) {
        System.out.println("String");
        visitId(ctx.id());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitVar_decl(MicroParser.Var_declContext ctx) {
        visit(ctx.var_type());
        visitId_list(ctx.id_list());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitId_list(MicroParser.Id_listContext ctx) {
        visitId(ctx.id());
        visit(ctx.id_tail());
        return  null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitIDTail(MicroParser.IDTailContext ctx) {
        visitId(ctx.id());
        visit(ctx.id_tail());
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitNoTail(MicroParser.NoTailContext ctx) {
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitFloatKeyWord(MicroParser.FloatKeyWordContext ctx) {
        System.out.println("Float");
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitIntKeyWord(MicroParser.IntKeyWordContext ctx) {
        System.out.println("Int");
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitNoDecl(MicroParser.NoDeclContext ctx) {
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitId(MicroParser.IdContext ctx) {
        System.out.println(ctx.getText());
        return null;
    }
}