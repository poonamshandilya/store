package Map;
import java.util.*;
public class LinkedHashMap5 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        map.put("eid",new Integer(99));
        map.put("name","srinivas");
        map.put("phone",new Long(65799999L));
        map.put("valid",new Boolean(true));
        System.out.println("\n** KEYS AND VALUES");
        Set st = map.entrySet();
        Iterator it = st.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            Map.Entry entry= (Map.Entry) obj;
            Object key = entry.getKey();
            Object val = entry.getValue();
           System.out.println(key + "\t\t"+val);

        }
    }
}
