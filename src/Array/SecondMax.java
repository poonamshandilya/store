package Array;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {80,20,10,50,40,90,60,99};
        int largest = arr[0];
        int secondlargest = arr[0];
        for (int num : arr){
            if (num>largest){//20>80
                secondlargest = largest;
                largest=num;
            } else if (num>secondlargest && num!=largest) {
                secondlargest = num;//20,
            }
        }
        System.out.println(secondlargest);

        //************

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int num : arr){
            if (num>max){
                secondmax = max;
                max=num;
            }else if (num>secondmax && num!=max){
                secondmax=num;
            }
        }
        System.out.println("second max " + secondmax);
    }
}
