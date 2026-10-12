package Map;
import java.util.*;
public class LinkedHashMap7 {
    public static void main(String[] args) {
        System.out.println("\n** LinkedHashMap");
        Map map=new LinkedHashMap();
        map.put("sid","jlc-099");
        map.put("name", "sri");
        map.put("name","sri");
        map.put("email","sri@jlc.com");
        map.put("phone","67899999");
        map.put("add","Mathikree");
         Set set= map.entrySet();
         Iterator it = set.iterator();
         while (it.hasNext()){
             System.out.println(it.next());
         }
    }
}
