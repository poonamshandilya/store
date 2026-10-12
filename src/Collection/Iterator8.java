package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator8 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sri"); list.add("Nivas"); list.add("dande");
        list.add("java"); list.add("JDBC"); list.add("jsp");
        Iterator it= list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}
