import java.util.ArrayList;

public class Tiny {

    private ArrayList<IRStatement> tiny;

    public Tiny() {
        tiny = new ArrayList<>();
    }

    void addStatement(IRStatement ir_statement) {
        tiny.add(ir_statement);
    }

    void printIRToFile(String fileName) {
        for (IRStatement s : tiny) {
            Utils.outputMessageToFile(s.toString() + '\n', fileName);
        }
    }

}
