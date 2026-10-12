package practiceprgm;

public class RangePrime {
    public static void main(String[] args) {
        int start = 100;
        int end = 1;
        int count = 0;
        for (int i=start;i>=end;i--){
            boolean isPrime =true;
            for (int j=2;j<=i/2;j++){
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                if (count==3) System.out.println(i);
            }
        }
    }
}
