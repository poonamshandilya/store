package Java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByValue {
    public static void main(String[] args) {
        Map<String,Integer>map = new HashMap<>();
        map.put("java",4);
        map.put("python",2);
        map.put("c++",3);
        map.put("AWS",1);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
