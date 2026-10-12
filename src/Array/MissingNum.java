package Array;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,9};
        int n = 9;
        int expectedsum = n*(n+1)/2;
        int actualsum = 0;
        for (int num : arr){
            actualsum=actualsum+num;
        }
        int missingnum = expectedsum-actualsum;
        System.out.println(missingnum);

        String str = "java";
        String str1 = "python";
        String result = str.concat(str1);
        char ch[] = result.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));

    }
}
