
public class IRStatement {
    private String opcode = "";
    private String op1 = "";
    private String op2 = "";
    private String resultOrLabel = "";

    //Arithmetic Instructions and Branch Operations
    public IRStatement(String opcode, String op1, String op2, String resultOrLabel) {
        this.opcode = opcode;
        this.op1 = op1;
        this.op2 = op2;
        this.resultOrLabel = resultOrLabel;
    }

    //Write and Read Operations and the RETURN STATEMENT
    public IRStatement(String opcode, String resultOrLabel) {
        this.opcode = opcode;
        this.resultOrLabel = resultOrLabel;
    }

    //Move Operations
    public IRStatement(String opcode, String op1, String resultOrLabel) {
        this.opcode = opcode;
        this.op1 = op1;
        this.resultOrLabel = resultOrLabel;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public void setResultOrLabel(String resultOrLabel) {
        this.resultOrLabel = resultOrLabel;
    }

    @Override
    public String toString() {
        return opcode + " " + op1 + " " + op2 + " " + resultOrLabel;
    }
}
