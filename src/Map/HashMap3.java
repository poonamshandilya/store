package Map;
import java.util.*;

public class HashMap3 {
    public static void main(String[] args) {
        String s1 = "abhinav";
        Map<Character, Integer> charCountMap=new HashMap<>();
        for (char  ch : s1.toCharArray()){
            if (charCountMap.containsKey(ch)){
                charCountMap.put(ch, charCountMap.get(ch)+ 1);

            }else {
                charCountMap.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer>  entry : charCountMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
