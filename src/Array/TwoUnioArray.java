package Array;

import java.util.LinkedHashSet;

public class TwoUnioArray {
    public static void main(String[] args) {
        int [] arr = {2,9,4,8};
        int [] arr1 = {3,9,4,2,5};
        LinkedHashSet<Integer>set = new LinkedHashSet<>();
        for (int num : arr){
            set.add(num);
        }
        for (int num : arr1){
            set.add(num);
        }
        System.out.println(set);
    }
}
