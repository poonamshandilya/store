package Collection;
import java.util.*;
import java.util.ArrayList;

public class Iterator10 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sri"); list.add("Nivas"); list.add("Dande");
        list.add("java"); list.add("JDBC"); list.add("jsp");
        ListIterator lit=list.listIterator();
        System.out.println(list);
        while (lit.hasNext()){
            Object obj = lit.next();
            System.out.println(obj);
            if (obj.equals("Nivas")) lit.remove();
            else if (obj.equals("java")) lit.set("Core Java");
            else if (obj.equals("jsp"))  lit.add("Servlets");{

            }
            {
                System.out.println(list);
            }
        }
    }
}
