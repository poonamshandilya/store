package practiceprgm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String s1="rider";
        Map<Character,Integer>map = new LinkedHashMap<>();
        for (char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer>entry : map.entrySet()){
            if (entry.getValue()==1){
                System.out.println("first non repeated character " + entry.getKey());
                break;
            }
        }
    }
}
