import java.util.ArrayList;


public class IR {
    private ArrayList<IR_Statement> ir;

    public IR() {
        ir = new ArrayList<>();
    }

    void addStatement(IR_Statement ir_statement) {
        ir.add(ir_statement);
    }

    void printIRToFile(String fileName) {
        for ( IR_Statement s : ir ) {
            Utils.outputMessageToFile(s.toString() + '\n', fileName);
        }
    }


}
