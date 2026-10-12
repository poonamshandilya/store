package Array;

import java.util.Arrays;

public class MergeTwoArraySort {
    public static void main(String[] args) {
        int[] arr1 = {2,9,8};
        int[] arr2 = {3,4,7};

        int[] merge = new int[arr1.length + arr2.length];
        for (int i=0; i<arr1.length;i++){
            merge[i] =arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            merge[arr1.length+i] = arr2[i];
        }
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
    }
}
