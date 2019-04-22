import java.util.ArrayList;

public class Tiny {

    private ArrayList<TinyStatement> tiny;

    public Tiny() {
        tiny = new ArrayList<>();
    }

    void addStatement(TinyStatement ir_statement) {
        tiny.add(ir_statement);
    }

    void printTinyToFile(String fileName) {
        for (TinyStatement s : tiny) {
            Utils.outputMessageToFile(s.toString() + '\n', fileName);
        }
    }

}
