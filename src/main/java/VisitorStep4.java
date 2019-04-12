import java.util.LinkedHashMap;
import java.util.List;

public class VisitorStep4 extends Visitor {

    LinkedHashMap<Object, Object> globalScope;
    IR ir = new IR();
    int tempCounter = 0, labelCounter = 0;


    public VisitorStep4(SymbolTable symbolTable) {
        globalScope = symbolTable.getTable().get(0);
    }

    @Override
    public Object visitProgram(MicroParser.ProgramContext ctx) {
        visitPgm_body(ctx.pgm_body());
        return null;
    }

    @Override
    public Object visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        visit(ctx.func_declarations());             //Functions

        return null;
    }

    @Override
    public Object visitFuncDecl(MicroParser.FuncDeclContext ctx) {
        visitFunc_decl(ctx.func_decl());
        return null;
    }

    @Override
    public Object visitFunc_decl(MicroParser.Func_declContext ctx) {
        ir.addStatement(new IR_Statement("Label", ctx.id().getText()));
        visitFunc_body(ctx.func_body());
        return null;
    }

    @Override
    public Object visitFunc_body(MicroParser.Func_bodyContext ctx) {
        visit(ctx.stmt_list());
        return null;
    }

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

    //basic stmt
    @Override
    public Object visitBasicStatment(MicroParser.BasicStatmentContext ctx) {
        visit(ctx.basic_stmt());
        return null;
    }

    @Override
    public Object visitAssignStatment(MicroParser.AssignStatmentContext ctx) {
        visitAssign_stmt(ctx.assign_stmt());
        return null;
    }

    @Override
    public Object visitAssign_stmt(MicroParser.Assign_stmtContext ctx) {
        visitAssign_expr(ctx.assign_expr());
        return null;
    }

    @Override
    public Object visitAssign_expr(MicroParser.Assign_exprContext ctx) {
        String type = globalScope.get(ctx.id().getText()).toString();
        if (type.equals("INT")) {
            ir.addStatement(new IR_Statement("STOREI", visitExpr(ctx.expr()).toString(), ctx.id().getText()));
        } else if (type.equals("FLOAT")) {
            ir.addStatement(new IR_Statement("STOREF", visitExpr(ctx.expr()).toString(), ctx.id().getText()));
        }
        return null;
    }

    @Override
    public Object visitExpr(MicroParser.ExprContext ctx) {
        visit(ctx.expr_prefix());
        visitTerm(ctx.term());//b*d

        return null;
    }

    @Override
    public Object visitExprPrefix(MicroParser.ExprPrefixContext ctx) {
        visit(ctx.expr_prefix());//epsilon
        visitTerm(ctx.term());
        visit(ctx.addop());//+

        return null;
    }

    @Override
    public Object visitTerm(MicroParser.TermContext ctx) {
        IR_Statement term = (IR_Statement) visit(ctx.factor_prefix());
        term.setOp2(visit(ctx.factor()).toString());
        term.setResultOrLabel("$T" + ++tempCounter);
        ir.addStatement(term);
        return null;
    }

    @Override
    public Object visitFactorPrefix(MicroParser.FactorPrefixContext ctx) {
        visit(ctx.factor_prefix());//epsilon
        String factor = visit(ctx.factor()).toString();//a
        String opcode = visit(ctx.mulop()).toString();//*

        return new IR_Statement(opcode, factor, "", "");
    }

    @Override
    public Object visitPrimaryFactor(MicroParser.PrimaryFactorContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public Object visitExprLabel(MicroParser.ExprLabelContext ctx) {
        visit(ctx.expr());
        return null;
    }

    @Override
    public Object visitIdLabel(MicroParser.IdLabelContext ctx) {

        return ctx.id().getText();
    }

    @Override
    public Object visitIntLit(MicroParser.IntLitContext ctx) {
        return ctx.INTLITERAL().getText();
    }

    @Override
    public Object visitFloatLit(MicroParser.FloatLitContext ctx) {

        return ctx.FLOATLITERAL().getText();
    }

    @Override
    public Object visitPlus(MicroParser.PlusContext ctx) {
        return null;
    }

    @Override
    public Object visitMinus(MicroParser.MinusContext ctx) {
        return null;
    }

    @Override
    public Object visitMul(MicroParser.MulContext ctx) {

        return "MULT";
    }

    @Override
    public Object visitDiv(MicroParser.DivContext ctx) {
        return "DIV";
    }

    @Override
    public Object visitReadStatment(MicroParser.ReadStatmentContext ctx) {
        return null;
    }

    @Override
    public Object visitWriteStatment(MicroParser.WriteStatmentContext ctx) {
        return null;
    }

    @Override
    public Object visitReturnStatment(MicroParser.ReturnStatmentContext ctx) {
        return null;
    }
//end of basic stmt

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

    //start if_stmt
    @Override
    public Object visitIf_stmt(MicroParser.If_stmtContext ctx) {
        //add label
        visitCond(ctx.cond());
        visit(ctx.stmt_list());
        //add label to skip else if true
        visit(ctx.else_part());
        return null;
    }

    @Override
    public Object visitCond(MicroParser.CondContext ctx) {
        visitExpr(ctx.expr(0));
        visit(ctx.compare());
        visitExpr(ctx.expr(1));
        return null;
    }

    @Override
    public Object visitEquals(MicroParser.EqualsContext ctx) {
        return null;
    }

    @Override
    public Object visitNotEquals(MicroParser.NotEqualsContext ctx) {
        return null;
    }

    @Override
    public Object visitLE(MicroParser.LEContext ctx) {
        return null;
    }

    @Override
    public Object visitGE(MicroParser.GEContext ctx) {
        return null;
    }

    @Override
    public Object visitLT(MicroParser.LTContext ctx) {
        return super.visitLT(ctx);
    }

    @Override
    public Object visitGT(MicroParser.GTContext ctx) {
        return null;
    }

    @Override
    public Object visitElsePart(MicroParser.ElsePartContext ctx) {

        visit(ctx.stmt_list());
        //label end of if statement
        return null;
    }

    public Object visitNoElsePart(MicroParser.NoElsePartContext ctx) {
        return null;
    }
    //end if_stmt

    //start for_stmt
    @Override
    public Object visitFor_stmt(MicroParser.For_stmtContext ctx) {
        visit(ctx.stmt_list());
        return null;
    }
    //end for_stmt


}
