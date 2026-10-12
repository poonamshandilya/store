package Map;
import java.util.*;
public class LinkedHashMap2 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put("eid",new Integer(99));
        map.put("name","srinivas");
        map.put("phone", new Long(6759999L));
        map.put("valid", new Boolean(true));
        System.out.println(map);
        System.out.println(map.containsKey("eid"));
        System.out.println(map.containsKey("email"));
        System.out.println(map.containsValue("srinivas"));
        System.out.println(map.containsValue(new Integer(99)));
        System.out.println(map.containsValue("SD"));
    }
}
