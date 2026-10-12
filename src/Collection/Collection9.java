package Collection;
import java.util.*;
import java.util.ArrayList;

public class Collection9 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("JDBC");  col.add("Sri");  col.add("JSP");
        col.add("Srinivas");  col.add("java");
        col.add("Dande");
        Collection col2=new ArrayList();
        col2.add("java");  col2.add("JDBC");  col2.add("JSP");
        System.out.println(col);
        System.out.println(col2);
        System.out.println(col.retainAll(col2));
        System.out.println(col);
        System.out.println(col2);
    }
}
