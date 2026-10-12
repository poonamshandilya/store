package Array;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {20,10,30,10,49,49,30,40};
        LinkedHashSet<Integer>set = new LinkedHashSet<>();
        for (int num : arr){
           set.add(num);
        }
        System.out.println(set);

    }

}
