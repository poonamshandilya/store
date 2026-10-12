package Array;

import java.util.HashSet;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {20,10,50,30,60,90};
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i] +" ");
        }
        // remove duplicate
        HashSet<Integer>set = new HashSet<>();
       for (int i=arr.length-1;i>=0;i--){
           if (!set.contains(arr[i])){
               System.out.print(arr[i]+" ");
               set.add(arr[i]);
           }
       }

    }
}
