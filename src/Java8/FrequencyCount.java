package Java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        String str = "programing";
        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
        str.chars().mapToObj(c -> (char) c).forEach(ch -> map.put(ch,map.getOrDefault(ch,0)+1) );
        for (Map.Entry<Character,Integer>entry : map.entrySet()){
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }
        Map<Character,Long>map1=str.chars().mapToObj(c -> (char) c).collect(Collectors
                .groupingBy(c -> c, Collectors.counting()));
        System.out.println(map1);
    }
}
