package Map;
import java.util.*;
public class HashMap2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("sid","JLC-099");
        map.put("name","srinivas");
       Map map2= new HashMap();
       map2.put("MKR","Mkthreee");
       map2.put("BTM","BTM Layout");
        System.out.println(map);
        System.out.println(map2);
        map.putAll(map2);
        System.out.println(map);
        System.out.println(map2);

        }
    }

