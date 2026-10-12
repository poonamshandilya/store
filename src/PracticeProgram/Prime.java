package PracticeProgram;

public class Prime {
    public static void main(String[] args) {
        int num = 17;
        int i=2;
        boolean isPrime = true;
        /*if(num<=1)
            isPrime=false;
        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num+"is prime");
        else
            System.out.println(num+"is not prime");*/
        /*if(num <=1)
            isPrime=false;
        while (i<=num/2){
            if (num%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime)
            System.out.println(num+"is prime");
        else System.out.println(num+"is not prime");*/
        if (num<=1)
            isPrime=false;
        else {
            do {
                if (num%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
            while (i<=num/2);
        }
        if (isPrime)
            System.out.println(num+"is prime");
        else System.out.println(num+"not prime");
    }
}
