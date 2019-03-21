// Generated from Micro.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MicroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface MicroVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link MicroParser#authors}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAuthors(MicroParser.AuthorsContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(MicroParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#id}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId(MicroParser.IdContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#pgm_body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPgm_body(MicroParser.Pgm_bodyContext ctx);

    /**
     * Visit a parse tree produced by the {@code StringDecl}
     * labeled alternative in {@link MicroParser#decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringDecl(MicroParser.StringDeclContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoDecl}
     * labeled alternative in {@link MicroParser#decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoDecl(MicroParser.NoDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#string_decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString_decl(MicroParser.String_declContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#str}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStr(MicroParser.StrContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#var_decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar_decl(MicroParser.Var_declContext ctx);

    /**
     * Visit a parse tree produced by the {@code FloatKeyWord}
     * labeled alternative in {@link MicroParser#var_type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloatKeyWord(MicroParser.FloatKeyWordContext ctx);

    /**
     * Visit a parse tree produced by the {@code FloatOrIntVarType}
     * labeled alternative in {@link MicroParser#any_type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloatOrIntVarType(MicroParser.FloatOrIntVarTypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code VoidKeyWord}
     * labeled alternative in {@link MicroParser#any_type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVoidKeyWord(MicroParser.VoidKeyWordContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#id_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId_list(MicroParser.Id_listContext ctx);

    /**
     * Visit a parse tree produced by the {@code IDTail}
     * labeled alternative in {@link MicroParser#id_tail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIDTail(MicroParser.IDTailContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoTail}
     * labeled alternative in {@link MicroParser#id_tail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoTail(MicroParser.NoTailContext ctx);

    /**
     * Visit a parse tree produced by the {@code ParamDeclList}
     * labeled alternative in {@link MicroParser#param_decl_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParamDeclList(MicroParser.ParamDeclListContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoParamList}
     * labeled alternative in {@link MicroParser#param_decl_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoParamList(MicroParser.NoParamListContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#param_decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParam_decl(MicroParser.Param_declContext ctx);

    /**
     * Visit a parse tree produced by the {@code ParamDeclTail}
     * labeled alternative in {@link MicroParser#param_decl_tail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParamDeclTail(MicroParser.ParamDeclTailContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoParamTail}
     * labeled alternative in {@link MicroParser#param_decl_tail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoParamTail(MicroParser.NoParamTailContext ctx);

    /**
     * Visit a parse tree produced by the {@code FuncDecl}
     * labeled alternative in {@link MicroParser#func_declarations}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncDecl(MicroParser.FuncDeclContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoFuncDecl}
     * labeled alternative in {@link MicroParser#func_declarations}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoFuncDecl(MicroParser.NoFuncDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#func_decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunc_decl(MicroParser.Func_declContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#func_body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunc_body(MicroParser.Func_bodyContext ctx);

    /**
     * Visit a parse tree produced by the {@code StatmnetList}
     * labeled alternative in {@link MicroParser#stmt_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatmnetList(MicroParser.StatmnetListContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoStatmnetList}
     * labeled alternative in {@link MicroParser#stmt_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoStatmnetList(MicroParser.NoStatmnetListContext ctx);

    /**
     * Visit a parse tree produced by the {@code BasicStatment}
     * labeled alternative in {@link MicroParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBasicStatment(MicroParser.BasicStatmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code IfStatment}
     * labeled alternative in {@link MicroParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStatment(MicroParser.IfStatmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code ForStatment}
     * labeled alternative in {@link MicroParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForStatment(MicroParser.ForStatmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code AssignStatment}
     * labeled alternative in {@link MicroParser#basic_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignStatment(MicroParser.AssignStatmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code ReadStatment}
     * labeled alternative in {@link MicroParser#basic_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReadStatment(MicroParser.ReadStatmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code WriteStatment}
     * labeled alternative in {@link MicroParser#basic_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWriteStatment(MicroParser.WriteStatmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code ReturnStatment}
     * labeled alternative in {@link MicroParser#basic_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnStatment(MicroParser.ReturnStatmentContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#assign_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign_stmt(MicroParser.Assign_stmtContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#assign_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign_expr(MicroParser.Assign_exprContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#read_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRead_stmt(MicroParser.Read_stmtContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#write_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWrite_stmt(MicroParser.Write_stmtContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#return_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturn_stmt(MicroParser.Return_stmtContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#if_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_stmt(MicroParser.If_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code ElsePart}
     * labeled alternative in {@link MicroParser#else_part}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElsePart(MicroParser.ElsePartContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoElsePart}
     * labeled alternative in {@link MicroParser#else_part}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoElsePart(MicroParser.NoElsePartContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#cond}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCond(MicroParser.CondContext ctx);

    /**
     * Visit a parse tree produced by the {@code Equals}
     * labeled alternative in {@link MicroParser#compare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEquals(MicroParser.EqualsContext ctx);

    /**
     * Visit a parse tree produced by the {@code NotEquals}
     * labeled alternative in {@link MicroParser#compare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNotEquals(MicroParser.NotEqualsContext ctx);

    /**
     * Visit a parse tree produced by the {@code LE}
     * labeled alternative in {@link MicroParser#compare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLE(MicroParser.LEContext ctx);

    /**
     * Visit a parse tree produced by the {@code GE}
     * labeled alternative in {@link MicroParser#compare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGE(MicroParser.GEContext ctx);

    /**
     * Visit a parse tree produced by the {@code LT}
     * labeled alternative in {@link MicroParser#compare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLT(MicroParser.LTContext ctx);

    /**
     * Visit a parse tree produced by the {@code GT}
     * labeled alternative in {@link MicroParser#compare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGT(MicroParser.GTContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#for_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_stmt(MicroParser.For_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code InitAssignExpr}
     * labeled alternative in {@link MicroParser#init_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInitAssignExpr(MicroParser.InitAssignExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoInitAssignExpr}
     * labeled alternative in {@link MicroParser#init_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoInitAssignExpr(MicroParser.NoInitAssignExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code IncrAssignExpr}
     * labeled alternative in {@link MicroParser#incr_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIncrAssignExpr(MicroParser.IncrAssignExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoIncrAssignExpr}
     * labeled alternative in {@link MicroParser#incr_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoIncrAssignExpr(MicroParser.NoIncrAssignExprContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr(MicroParser.ExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code ExprPrefix}
     * labeled alternative in {@link MicroParser#expr_prefix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprPrefix(MicroParser.ExprPrefixContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoExprPrefix}
     * labeled alternative in {@link MicroParser#expr_prefix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoExprPrefix(MicroParser.NoExprPrefixContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#term}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTerm(MicroParser.TermContext ctx);

    /**
     * Visit a parse tree produced by the {@code FactorPrefix}
     * labeled alternative in {@link MicroParser#factor_prefix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFactorPrefix(MicroParser.FactorPrefixContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoFactorPrefix}
     * labeled alternative in {@link MicroParser#factor_prefix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoFactorPrefix(MicroParser.NoFactorPrefixContext ctx);

    /**
     * Visit a parse tree produced by the {@code PrimaryFactor}
     * labeled alternative in {@link MicroParser#factor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimaryFactor(MicroParser.PrimaryFactorContext ctx);

    /**
     * Visit a parse tree produced by the {@code CallExpr}
     * labeled alternative in {@link MicroParser#factor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCallExpr(MicroParser.CallExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code ExprLabel}
     * labeled alternative in {@link MicroParser#primary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprLabel(MicroParser.ExprLabelContext ctx);

    /**
     * Visit a parse tree produced by the {@code IdLabel}
     * labeled alternative in {@link MicroParser#primary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdLabel(MicroParser.IdLabelContext ctx);

    /**
     * Visit a parse tree produced by the {@code IntLit}
     * labeled alternative in {@link MicroParser#primary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntLit(MicroParser.IntLitContext ctx);

    /**
     * Visit a parse tree produced by the {@code FloatLit}
     * labeled alternative in {@link MicroParser#primary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloatLit(MicroParser.FloatLitContext ctx);

    /**
     * Visit a parse tree produced by {@link MicroParser#call_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCall_expr(MicroParser.Call_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code ExprList}
     * labeled alternative in {@link MicroParser#expr_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprList(MicroParser.ExprListContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoExprList}
     * labeled alternative in {@link MicroParser#expr_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoExprList(MicroParser.NoExprListContext ctx);

    /**
     * Visit a parse tree produced by the {@code ExprTail}
     * labeled alternative in {@link MicroParser#expr_list_tail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprTail(MicroParser.ExprTailContext ctx);

    /**
     * Visit a parse tree produced by the {@code NoExprTail}
     * labeled alternative in {@link MicroParser#expr_list_tail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoExprTail(MicroParser.NoExprTailContext ctx);

    /**
     * Visit a parse tree produced by the {@code Plus}
     * labeled alternative in {@link MicroParser#addop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlus(MicroParser.PlusContext ctx);

    /**
     * Visit a parse tree produced by the {@code Minus}
     * labeled alternative in {@link MicroParser#addop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinus(MicroParser.MinusContext ctx);

    /**
     * Visit a parse tree produced by the {@code Mul}
     * labeled alternative in {@link MicroParser#mulop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMul(MicroParser.MulContext ctx);

    /**
     * Visit a parse tree produced by the {@code Div}
     * labeled alternative in {@link MicroParser#mulop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiv(MicroParser.DivContext ctx);
}