public class TinyStatement {

    private String opcode = "";
    private String op = "";
    private String resultOrLabel = "";

    public TinyStatement() {
    }

    //System Operation
    public TinyStatement(String opcode, String resultOrLabel) {
        if (opcode.startsWith("read") || opcode.startsWith("write")) {
            this.opcode = "sys " + opcode;
        } else {
            this.opcode = opcode;
        }
        this.resultOrLabel = resultOrLabel;
    }

    //Other Operations
    public TinyStatement(String opcode, String op, String result) {
        this.opcode = opcode;
        this.op = op;
        this.resultOrLabel = result;
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

