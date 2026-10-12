package Collection;
import java.util.*;
import java.util.ArrayList;

public class Collection8 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("JDBC");  col.add("Sri");  col.add("Jsp");
        col.add("Srinivias");  col.add("java");  col.add("Dande");
        Collection col2=new ArrayList();
        col2.add("java"); col2.add("JDBC");  col2.add("Jsp");
        System.out.println(col);
        System.out.println(col2);
        System.out.println(col.removeAll(col2));
        System.out.println(col);
        System.out.println(col2);
    }
}
