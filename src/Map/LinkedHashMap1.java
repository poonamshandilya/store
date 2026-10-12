package Map;
import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        System.out.println(map);
        System.out.println("size:"+map.size());
        System.out.println("IS EMPTY"+map.isEmpty());
        map.put("eid",new Integer(99));
        map.put("name","srinivas");
        map.put("phone",new Long(6579999L));
        map.put("valid", new Boolean(true));
        System.out.println(map);
        System.out.println("size:"+map.size());
        System.out.println("IS EMPTY"+map.isEmpty());

    }

}
