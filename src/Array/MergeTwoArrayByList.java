package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MergeTwoArrayByList {
    public static void main(String[] args) {
        int[] arr1 = {2,5,7};
        int[] arr2 = {3,6,9,1};
        ArrayList<Integer>list = new ArrayList<>();
        for (int num : arr1){
            list.add(num);
        }
        for (int num : arr2){
            list.add(num);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
