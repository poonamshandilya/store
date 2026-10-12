package Collection;
import java.util.*;
import java.util.ArrayList;

public class Collection2 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("Sri");  col.add("Srinivas");
        col.add("SD");  col.add("Dande");
        System.out.println(col.contains("Srinivas"));
        System.out.println(col.contains("java"));
        System.out.println(col);
        System.out.println(col.remove("JDBC"));
        System.out.println(col.remove("srinivas"));
        System.out.println(col);
        col.clear();
        System.out.println(col);
        System.out.println(col.size());
    }
}
