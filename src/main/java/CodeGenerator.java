import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CodeGenerator {
    private LinkedHashMap<Object, Object> globalScope;
    private ArrayList<IRStatement> ir;

    private Tiny tiny = new Tiny();

    public CodeGenerator(SymbolTable symbolTable, ArrayList ir) {
        this.ir = ir;
        globalScope = symbolTable.getTable().get(0);
    }


}
