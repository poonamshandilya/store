package Collection;
import java.util.*;
import java.util.ArrayList;

public class Iterator13 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Sri"); list.add("Nivas"); list.add("dande");
        list.add("java"); list.add("JDBC"); list.add("JSp");
        ListIterator lit = list.listIterator(2);
        do {
            int indx=lit.nextIndex();
            Object obj=lit.next();
            System.out.println(indx+"\t"+obj);
        }while (lit.hasNext());
        System.out.println();
        lit=list.listIterator(5);
        do {
            int indx=lit.previousIndex();
            Object obj=lit.previous();
            System.out.println(indx+"\t"+obj);
        }while (lit.hasPrevious());
    }
}
