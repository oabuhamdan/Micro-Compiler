import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private List<LinkedHashMap<Object, Object>> table;

    public SymbolTable() {
        this.table = new ArrayList<>();
    }

    public Map<Object, Object> newScope() {
        LinkedHashMap<Object, Object> localVariables = new LinkedHashMap<>();
        table.add(localVariables);
        return localVariables;
    }


    public void printAllScopesInfo() {
        int count=0;
        for ( LinkedHashMap<Object, Object> map : table ) {
            System.out.println("<<Block #"+ ++count+" Variables>>");
            for ( Map.Entry<Object, Object> entry : map.entrySet() ) {
                Object type = entry.getKey();
                Object id = entry.getValue();
                System.out.println(type + " : " + id);
            }
        }
    }
}
