package Map;
import java.util.*;
public class LinkedHashMap3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
       /* map.put("eid", new Integer(99));
        map.put("name","srinivas");
        map.put("phone", new Long(6759999L));
        System.out.println(map);
        System.out.println("remove(eid)"+map.remove("eid"));
        System.out.println(map);
        System.out.println("put - phone:"+map.put("phone",new Long(312567890L)));
        System.out.println(map);
        System.out.println("get");
        System.out.println(map.get("name"));
        System.out.println(map.get("email"));*/
        map.put("India", 1000);
        map.put("japan", 2000);
        map.put("Nepal",3000);
      /* Set data = map.entrySet();
       Iterator it=data.iterator();
       while (it.hasNext()){
           Object obj=it.next();
           Map.Entry entry= (Map.Entry) obj;
           //Object key=entry.getKey();
           //Object value =entry.getValue();
           System.out.println(entry.getKey()+ "\t" + entry.getValue());
       }*/
        for(Map.Entry<String , Integer>entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
