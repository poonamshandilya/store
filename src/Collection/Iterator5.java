package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator5 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Iterator  it= list.iterator();
        if (it.hasNext())
            System.out.println(it.next());
        System.out.println("Main Cimpleted");
    }
}
