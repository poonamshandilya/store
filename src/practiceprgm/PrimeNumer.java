package practiceprgm;

public class PrimeNumer {
    public static void main(String[] args) {
        int num =31;
        boolean isPrime = true;


        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                isPrime = false;
                System.out.println("not prime "+num);
                break;
            }
        }
        if (isPrime) System.out.println("prime " +num);
    }
}
