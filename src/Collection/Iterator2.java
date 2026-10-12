package Collection;
import java.util.*;
//import java.util.Vector;

public class Iterator2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Enumeration enu=v.elements();
        if (enu.hasMoreElements())
            System.out.println(enu.nextElement());
        System.out.println("Main Completed");
    }
}
