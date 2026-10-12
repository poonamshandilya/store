package Collection;
import java.util.*;
import java.util.ArrayList;;
public class Collection5 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("Sri");  col.add("Nivas");  col.add("dande");
        System.out.println(col+"\t"+col.size());
        Collection col2=new ArrayList();
        col2.add("java"); col2.add("JDBC"); col2.add("JSP");
        System.out.println(col2+"\t"+col2.size());
        col.add(col2);
        System.out.println(col+"\t"+col.size());
    }
}
