import java.util.*;

public class SymbolTable {
    private List<LinkedHashMap<Object, Object>> table;
    private List<String> names;

    public SymbolTable() {
        this.table = new ArrayList<>();
        this.names = new ArrayList<>();
    }

    public void setName(String s) {
        names.add(s);
    }

    public Map<Object, Object> newScope() {
        LinkedHashMap<Object, Object> localVariables = new LinkedHashMap<>();
        table.add(localVariables);
        return localVariables;
    }


    public void printAllScopesInfo() {
        Iterator namesIterator = names.iterator();
        for (LinkedHashMap<Object, Object> map : table) {
            if (namesIterator.hasNext())
                System.out.println("<<" + namesIterator.next() + " variables>>");
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                Object id = entry.getKey();
                Object type = entry.getValue();
                System.out.println(id + " : " + type);
            }
            System.out.println();
        }
    }

}
