package practiceprgm;

public class Nprime {
    public static void main(String[] args) {
        int num = 50;
        for (int i=2;i<=num;i++){
            boolean isprime = true;
            for (int j=2;j*j<=i;j++){
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime){
                System.out.println(i + " ");
            }

        }
    }

}
