package Comparator;
import java.util.*;
public class Comparator4 {
    public static void main(String[] args) {
        TreeSet tset = new TreeSet(new StringDescComparator());
        tset.add("Manish");
        tset.add("Sri");
        tset.add("Nivas");
        tset.add("Rahul");
        Iterator it = tset.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }
}
class StringDescComparator implements Comparator{
    public int compare(Object ob1, Object ob2){
        if (ob1 instanceof String && ob2 instanceof String){
            String s1=(String)ob1;
            String s2=(String)ob2;
            return s2.compareTo(s1);
        }
        return 0;
    }
}
