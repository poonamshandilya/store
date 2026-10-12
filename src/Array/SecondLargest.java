package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {20,10,30,40,35,70,50,90,60};
        int smallest = Integer.MAX_VALUE;
        int secondsamllest = Integer.MAX_VALUE;
        for (int num : arr){
            if (num<smallest){
                secondsamllest=smallest;
                smallest=num;
            } else if (num<secondsamllest && num!=smallest) {
                secondsamllest=num;
            }
        }
        System.out.println("second smallest " + secondsamllest);
    }
}
