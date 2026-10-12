package Collection;

import java.util.*;
import java.util.Vector;

public class Iterator3 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement("Sri");
        v.addElement("Nivas");
        v.addElement("dande");
        v.addElement("SD");
        Enumeration enu=v.elements();
        while (enu.hasMoreElements())
            System.out.println(enu.nextElement());
    }
}
