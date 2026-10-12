package Map;
import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        System.out.println("\n**  Hashmap");
        Map map =new HashMap();
        map.put("sid","jlc-099");
        map.put("name","sri");
        map.put("email", "sri@jlc.com");
        map.put("phone","765899999");
        map.put("add","Makthree");
        Set set =map.entrySet();
        Iterator it= set.iterator();
        while (it.hasNext())
           System.out.println(it.next());
    }
}
