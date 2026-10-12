package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator4 {
    public static void main(String[] args) {
        List list =  new ArrayList();
        Iterator it=list.iterator();
        System.out.println(it.next());
        System.out.println("Main Completed");
    }
}
