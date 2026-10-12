package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {20,30,17,25,27,11,36};
        int evencount = 0;
        int oddcount = 0;
        for (int num : arr){
            if (num%2==0){
               evencount++;
            }else {
                oddcount++;
            }
        }
        //..........

        System.out.println("even " + evencount);
        System.out.println("odd " + oddcount);

        ArrayList<Integer>even = new ArrayList<>();
        ArrayList<Integer>odd = new ArrayList<>();
        for (int num : arr){
            if (num%2==0){
                even.add(num);
            }else {
                odd.add(num);
            }
        }
        System.out.println("even " + even);
        System.out.println("odd " + odd);

        //.......
        System.out.println("even number ");
        Arrays.stream(arr).filter(num -> num%2==0).forEach(System.out::println);
        System.out.println("odd number ");
        Arrays.stream(arr).filter(num -> num%2!=0).forEach(System.out::println);

    }
}
