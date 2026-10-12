package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {20,92,50,60,10,39,50,56,92};
        HashSet<Integer>set = new HashSet<>();
        System.out.println("duplicate element ");
        for (int num : arr){
            if (!set.add(num)){
                System.out.println(num);
            }
        }
        HashMap<Integer,Integer>map =  new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
                for (Map.Entry<Integer,Integer>entry : map.entrySet()){
                    if (entry.getValue()>1){
                        System.out.println(entry.getKey()+ "..."+ entry.getValue());
                    }
        }
    }
}
