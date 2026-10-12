package Collection;
import java.util.*;
import java.util.ArrayList;

public class Collection7 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("JDBC");  col.add("JSP");  col.add("srinivas");
        col.add("java"); col.add("Dande");
        Collection col2=new ArrayList();
        col2.add("java");  col2.add("JDBC"); col2.add("JSP");
        Collection col3=new ArrayList();
        col3.add("java"); col3.add("JDBC");  col3.add("EjB");
        System.out.println(col+"\n"+col2+"\n"+col3);
        System.out.println(col.containsAll(col2));
        System.out.println(col.containsAll(col3));
    }
}
