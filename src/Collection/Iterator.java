package Collection;
import java.util.*;
public class Iterator {
    public static void main(String[] args) {
        Vector v = new Vector();
        Enumeration enu=v.elements();
        System.out.println(enu.nextElement());
        System.out.println("Main Completed");
    }
}
