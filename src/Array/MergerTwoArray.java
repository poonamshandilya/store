package Array;

import java.util.Arrays;

public class MergerTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2,5,9,6};
        int[] arr2 = {4,2,7,1};
        int[] merged = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2[j]){
                merged[k]=arr1[i];
                i++;
            }else {
                merged[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length){
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            merged[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(merged));
    }
}
