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

        IR_Statement exprPrefix = (IR_Statement) visit(ctx.expr_prefix());      //add and sub
        String term = visitTerm(ctx.term()).toString();               //mul and div
        if (exprPrefix != null) {
            exprPrefix.setOp2(term);
            String result = "$T" + ++tempCounter;
            exprPrefix.setResultOrLabel(result);
            ir.addStatement(exprPrefix);
            return result;
        }
        return term;
    }

    @Override
    public Object visitExprPrefix(MicroParser.ExprPrefixContext ctx) {
        IR_Statement exprPrefix = (IR_Statement) visit(ctx.expr_prefix());
        String term = visitTerm(ctx.term()).toString();
        String op = visit(ctx.addop()).toString() + factorType(term);
        if (exprPrefix != null) {
            exprPrefix.setOp2(term);
            String result = "$T" + ++tempCounter;
            exprPrefix.setResultOrLabel(result);
            ir.addStatement(exprPrefix);
            return new IR_Statement(op, result, "", "");
        } else
            return new IR_Statement(op, term, "", "");
    }

    @Override
    public Object visitTerm(MicroParser.TermContext ctx) {
        IR_Statement factorPrefix = (IR_Statement) visit(ctx.factor_prefix());
        String factor = visit(ctx.factor()).toString();

        if (factorPrefix != null) {
            factorPrefix.setOp2(factor);
            String result = "$T" + ++tempCounter;
            factorPrefix.setResultOrLabel(result);
            ir.addStatement(factorPrefix);
            return result;
        }
        return factor;

    }

    @Override
    public Object visitFactorPrefix(MicroParser.FactorPrefixContext ctx) {
        IR_Statement factorPrefix = (IR_Statement) visit(ctx.factor_prefix());
        String factor = visit(ctx.factor()).toString();
        String op = visit(ctx.mulop()).toString() + factorType(factor); // MUL
        if (factorPrefix != null) {
            factorPrefix.setOp2(factor);
            String result = "$T" + ++tempCounter;
            factorPrefix.setResultOrLabel(result);
            ir.addStatement(factorPrefix);
            return new IR_Statement(op, result, "", "");
        } else return new IR_Statement(op, factor, "", "");
    }

    @Override
    public Object visitPrimaryFactor(MicroParser.PrimaryFactorContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public Object visitExprLabel(MicroParser.ExprLabelContext ctx) {
        return visit(ctx.expr());
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
        return "ADD";
    }

    @Override
    public Object visitMinus(MicroParser.MinusContext ctx) {
        return "SUB";
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
        visitRead_stmt(ctx.read_stmt());
        return null;
    }

    @Override
    public Object visitRead_stmt(MicroParser.Read_stmtContext ctx) {
        List id_list = (List) visitId_list(ctx.id_list());
        for ( Object id : id_list ) {
            ir.addStatement(new IR_Statement("READ" + factorType((String) id), (String) id));
        }
        return null;
    }

    @Override
    public Object visitWriteStatment(MicroParser.WriteStatmentContext ctx) {
        visitWrite_stmt(ctx.write_stmt());
        return null;
    }

    @Override
    public Object visitWrite_stmt(MicroParser.Write_stmtContext ctx) {
        List id_list = (List) visitId_list(ctx.id_list());
        for ( Object id : id_list ) {
            ir.addStatement(new IR_Statement("WRITE" + factorType((String) id), (String) id));
        }
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
        String labelAfterIF = "L" + ++labelCounter;             //No else part

        IR_Statement cond = (IR_Statement) visitCond(ctx.cond());       //LE p 10

        cond.setResultOrLabel(labelAfterIF);

        ir.addStatement(cond);  // LE p 10 L1
        visit(ctx.stmt_list());
        /*if (visit(ctx.else_part()) != null) {
            String labelAfterElse = "L" + ++labelCounter;
            ir.addStatement(new IR_Statement("Label", labelAfterElse));
        }
        */

        visit(ctx.else_part());
        return null;
    }
    @Override
    public Object visitElsePart(MicroParser.ElsePartContext ctx) {
        String labelAfterElse = "L" + ++labelCounter;          //else part
        ir.addStatement(new IR_Statement("JUMP", labelAfterElse));
        String labelAfterIF = "L" + --labelCounter;          //else part
        ir.addStatement(new IR_Statement("Label", labelAfterIF));

        visit(ctx.stmt_list());
        labelCounter++;
        ir.addStatement(new IR_Statement("Label", labelAfterElse));

        //label end of if statement
        return null;
    }

    @Override
    public Object visitNoElsePart(MicroParser.NoElsePartContext ctx) {
        String labelAfterIF = "L" + labelCounter;          //else part
        ir.addStatement(new IR_Statement("Label", labelAfterIF));
        return null;
    }

    @Override
    public Object visitCond(MicroParser.CondContext ctx) {
        String lhs = visitExpr(ctx.expr(0)).toString();
        String op = visit(ctx.compare()).toString();
        String rhs = visitExpr(ctx.expr(1)).toString();
        return new IR_Statement(op, lhs, rhs, "");
    }

    @Override
    public Object visitEquals(MicroParser.EqualsContext ctx) {

        return "NE";
    }

    @Override
    public Object visitNotEquals(MicroParser.NotEqualsContext ctx) {
        return "EQ";
    }

    @Override
    public Object visitLE(MicroParser.LEContext ctx) {
        return "GT";
    }

    @Override
    public Object visitGE(MicroParser.GEContext ctx) {
        return "LT";
    }

    @Override
    public Object visitLT(MicroParser.LTContext ctx) {
        return "GE";
    }

    @Override
    public Object visitGT(MicroParser.GTContext ctx) {
        return "LE";
    }


    //end if_stmt

    //start for_stmt
    @Override
    public Object visitFor_stmt(MicroParser.For_stmtContext ctx) {
        visit(ctx.stmt_list());
        return null;
    }
    //end for_stmt


    private String lastChoice = "";

    private String factorType(String factor) {
        Object type = globalScope.get(factor);
        if (type != null) {
            if (type.toString().equals("INT")) {
                lastChoice = "I";
                return "I";
            } else if (type.toString().equals("FLOAT")) {
                lastChoice = "F";
                return "F";
            } else {
                return "S";
            }
        } else if (!factor.startsWith("$")) {
            if (factor.contains(".")) {
                lastChoice = "F";
                return "F";
            } else {
                lastChoice = "I";
                return "I";
            }
        } else return lastChoice;
    }

}
