package Java8;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "programing";

        Map<Character,Long>map = str.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy
                (c -> c, Collectors.counting()));
        map.forEach((key,value)->{
            if (value>1){
                System.out.println(key + "..." + value);
            }
        });

        //***********

        LinkedHashMap<Character,Integer>map1 = new LinkedHashMap<>();
        str.chars().mapToObj(c -> (char) c)
                .forEach(ch -> map1.put(ch, map1.getOrDefault(ch,0)+1));
        for (Map.Entry<Character,Integer>entry : map1.entrySet()){
            if (entry.getValue()>1){
                System.out.println("duplicate character " + entry.getKey() + "..." + entry.getValue());
            }
        }
    }
}
