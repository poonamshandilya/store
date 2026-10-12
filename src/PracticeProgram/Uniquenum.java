package PracticeProgram;

import java.util.HashMap;
import java.util.Map;

public class Uniquenum {
    public static void main(String[] args) {
        int[] arr= {2,3,8,2,5,9,4,3,7};
        for (int i=0; i<arr.length; i++){
            int count =0;

            for (int j=0; j<arr.length; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count==1){
                System.out.println("unique element" + arr[i]);

            }

        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
