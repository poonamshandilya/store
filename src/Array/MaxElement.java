package Array;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr ={10,30,53,11,25,90,60};
        int max =arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
