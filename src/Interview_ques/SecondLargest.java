package Interview_ques;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {20,10,15,25,30};
        int largest  = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > largest){
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num!=largest) {
                secondlargest = num;
            }
        }
        if (secondlargest==Integer.MIN_VALUE){
            System.out.println("no second largest element found");
        }else
            System.out.println("second largest element found " + secondlargest);
    }
}
