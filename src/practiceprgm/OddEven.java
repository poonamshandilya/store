package practiceprgm;

public class OddEven {
    public static void main(String[] args) {
        //int num = 21;
//        for (int i=0; i<=10;i++)
//        if (i%2==0){
//            System.out.println("even number " +i);
//        }else {
//            System.out.println("odd number " +i);
//        }
        int arr[] = {2,3,5,6,12,9,8,32};
        //int odd =0; int even =0;
        for (int num : arr){
            if (num%2==0){
                System.out.println("even number " + num);
                //even++;
            }else {
                //odd++;
                System.out.println("odd number " + num);
            }
        }
        //System.out.println("even number " + even);
       // System.out.println("odd number " + odd);
    }

}
