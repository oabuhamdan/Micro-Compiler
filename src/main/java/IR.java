import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IR {
    ArrayList<IR_Statement> ir;

    public IR() {
        ir = new ArrayList<>();
    }

    void addStatement(IR_Statement ir_statement) {
        ir.add(ir_statement);
    }

    void printIR() {
        for (IR_Statement s : ir) {
            System.out.println(s);
        }
    }


}
