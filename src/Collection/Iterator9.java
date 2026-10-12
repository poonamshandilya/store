package Collection;
import java.util.*;
import java.util.ArrayList;

public class Iterator9 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sri"); list.add("Nivas"); list.add("dande");
        list.add("java"); list.add("jdbc"); list.add("jsp");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            Object obj=lit.next();
            System.out.println(obj);
        }
    }
}
