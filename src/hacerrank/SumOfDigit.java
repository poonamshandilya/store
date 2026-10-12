package hacerrank;

public class SumOfDigit {
    public static int simpleArraySum(int[] ar){
     int sum =0;
     for (int num : ar){
         sum += num;
     }
     return sum;
    }
    public static void main(String[] args){
        int[] ar = {1,2,3,4,10,11};
        System.out.println(simpleArraySum(ar));
    }
}
