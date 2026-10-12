package Interview;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,3,7};
        int n =8;
        int actualsum=0;
        int expectedsum =  n*(n+1)/2;;

        for (int num1 : arr){
            actualsum+=num1;
        }
        int missingnum = expectedsum - actualsum;
        System.out.println(missingnum);

    }
}
