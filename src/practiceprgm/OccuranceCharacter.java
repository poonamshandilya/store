package practiceprgm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccuranceCharacter {
    public static void main(String[] args) {
        String s1="mAlayalaM";
        s1=s1.toLowerCase();
        Map<Character,Integer>map = new HashMap<>();
        for (char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "....." + entry.getValue());
        }
    }
}
