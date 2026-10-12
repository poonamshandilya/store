package practiceprgm;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCh {
    public static void main(String[] args) {
        String s1="developer hii";
        Map<Character,Integer>map = new HashMap<>();
        for (char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()>1){
                System.out.println("duplicate character "+entry.getKey()+"..."+entry.getValue());
            }
        }

    }
}
