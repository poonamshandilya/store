package Java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeated {
    public static void main(String[] args) {
        String str = "banana";
        Character result = str.chars().mapToObj(c ->(char) c ).collect(Collectors.
                groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(enetry -> enetry.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("first repeated character = " + result);

        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
        str.chars().mapToObj(c -> (char) c)
                .forEach(ch -> map.put(ch,map.getOrDefault(ch,0)+1));
        //Character results =null;
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getValue()==1){
                //results = entry.getKey();
                System.out.println("repeated character  " + entry.getKey() +"..." +entry.getValue());
               // break;
            }
        }
       // System.out.println(" repeated character = " + results);

    }
}
