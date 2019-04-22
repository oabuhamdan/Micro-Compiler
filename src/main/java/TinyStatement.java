public class TinyStatement {

    private String opcode = "";
    private String op = "";
    private String resultOrLabel = "";


    //System Operation
    public TinyStatement(String opcode, String resultOrLabel) {
        this.opcode = "sys " + opcode;
        this.resultOrLabel = resultOrLabel;
    }

    //Other Operations
    public TinyStatement(String opcode, String op, String resultOrLabel) {
        this.opcode = opcode;
        this.op = op;
        this.resultOrLabel = resultOrLabel;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public void setOp(String op) {
        this.op = op;
    }


    public void setResultOrLabel(String resultOrLabel) {
        this.resultOrLabel = resultOrLabel;
    }

    @Override
    public String toString() {
        return opcode + " " + op + " " + resultOrLabel;
    }
}

