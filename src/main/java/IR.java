import java.util.ArrayList;


public class IR {
    private ArrayList<IRStatement> ir;

    public IR() {
        ir = new ArrayList<>();
    }

    void addStatement(IRStatement ir_statement) {
        ir.add(ir_statement);
    }

    void printIRToFile(String fileName) {
        for (IRStatement s : ir) {
            Utils.outputMessageToFile(s.toString() + '\n', fileName);
        }
    }

    public ArrayList<IRStatement> getIr() {
        return ir;
    }
}
