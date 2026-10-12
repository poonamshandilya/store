package PracticeProgram;
import java.util.*;
public class Reversemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("A",1);
        map.put("Z",2);
        map.put("E",3);
        map.put("D",4);
//        for (String key : map.descendingKeySet()){
//            System.out.println(key+"...");
//        }
        System.out.println(map);
        Set keys = map.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()){
           Object key =it.next();
            System.out.println(key);
        }
        System.out.println("values....");
        Collection col = map.values();
        Iterator it1 = col.iterator();
        while (it.hasNext()){
            Object val =it1.next();
            System.out.println(val);
        }
    }
}
