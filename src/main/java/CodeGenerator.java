import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CodeGenerator {
    private LinkedHashMap<Object, Object> globalScope;
    private ArrayList<IRStatement> ir;
    static int tempCount = 0;

    private Tiny tiny = new Tiny();

    public Tiny getTiny() {
        return tiny;
    }

    public CodeGenerator(SymbolTable symbolTable, IR ir) {
        this.ir = ir.getIr();
        globalScope = symbolTable.getTable().get(0);
    }

    public void generateTiny() {
        addVars();
        IRProcessing();
    }

    private void addVars() {
        for ( Map.Entry<Object, Object> entry : globalScope.entrySet() ) {
            String id = (String) entry.getKey();
            String type = (String) entry.getValue();
            TinyStatement statement;
            if (type.startsWith("STRING"))
                statement = new TinyStatement("str", id + " " + type.substring(9));
            else
                statement = new TinyStatement("var", id);
            tiny.addStatement(statement);
        }
    }

    private void IRProcessing() {
        for ( IRStatement statement : ir ) {
            String opcode = statement.getOpcode().toLowerCase();
            String op1 = statement.getOp1().toLowerCase();
            String op2 = statement.getOp2().toLowerCase();
            String labelOrResult = statement.getResultOrLabel().toLowerCase();
            TinyStatement tinyStatement = new TinyStatement();

            if (opcode.equals("label") || opcode.equals("jump")) {
                processLabelAndJump(tinyStatement, opcode, labelOrResult);
            } else if (opcode.startsWith("write") || opcode.startsWith("read")) {
                processWriteAndRead(tinyStatement, opcode, labelOrResult);
            } else if (opcode.startsWith("add") || opcode.startsWith("sub")
                    || opcode.startsWith("mul") || opcode.startsWith("div")) {
                processArithmetic(opcode, op1, op2);
                continue;
            } else if (opcode.startsWith("store")) {
                processStore(tinyStatement, op1, labelOrResult);
            } else if (opcode.length() == 2) {   //NE GT GE LT
                processComparison(opcode, op1, op2, labelOrResult);
                continue;
            }
            tiny.addStatement(tinyStatement);

        }
    }

    private void processStore(TinyStatement tinyStatement, String op1, String labelOrResult) {
        tinyStatement.setOpcode("move");
        op1 = op1.startsWith("$t") ? "r" + tempCount : op1;
        tinyStatement.setOp(op1);
        tinyStatement.setResultOrLabel(labelOrResult);
    }

    private void processComparison(String opcode, String op1, String op2, String labelOrResult) {
        op1 = (op1.startsWith("$")) ? op1.replace("$t", "r") : op1;
        op2 = (op2.startsWith("$")) ? op2.replace("$t", "r") : op2;
        tiny.addStatement(new TinyStatement("move", op2, "r" + ++tempCount));

        tiny.addStatement(new TinyStatement("cmp" + varType(op1, op2), op1, "r" + tempCount));

        tiny.addStatement(new TinyStatement("j" + opcode, labelOrResult));
    }

    private void processLabelAndJump(TinyStatement tinyStatement, String opcode, String labelOrResult) {
        if (opcode.equals("label"))
            tinyStatement.setOpcode("label");
        else
            tinyStatement.setOpcode("jmp");
        tinyStatement.setResultOrLabel(labelOrResult);
    }

    private void processArithmetic(String opcode, String op1, String op2) {
        opcode=opcode.replace("t","");
        op1 = (op1.startsWith("$")) ? op1.replace("$t", "r") : op1;
        op2 = (op2.startsWith("$")) ? op2.replace("$t", "r") : op2;

        tiny.addStatement(new TinyStatement("move", op1, "r" + ++tempCount));  //move z r1

        String op = opcode.substring(0, opcode.length() - 1);
        tiny.addStatement(new TinyStatement(op + type(opcode), op2, "r" + tempCount));
    }

    private void processWriteAndRead(TinyStatement tinyStatement, String opcode, String labelOrResult) {
        String op = opcode.substring(0, opcode.length() - 1);
        tinyStatement.setOpcode("sys " + op + type(opcode));
        tinyStatement.setResultOrLabel(labelOrResult);
    }

    private String type(String opcode) {
        if (opcode.endsWith("s")) {
            return "s";
        } else if (opcode.endsWith("f")) {
            return "r";
        } else {
            return "i";
        }
    }

    private String varType(String var1, String var2) {
        Object type1 = globalScope.get(var1);
        if (type1 != null) {
            if (type1.toString().equals("INT")) {
                return "i";
            } else {
                return "r";
            }
        } else {
            Object type2 = globalScope.get(var2);
            if (type2.toString().equals("INT"))
                return "i";
            else
                return "r";
        }
    }
}