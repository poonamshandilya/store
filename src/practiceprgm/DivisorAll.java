package practiceprgm;

public class DivisorAll {
    public static void main(String[] args) {
        int num = 38;
        System.out.println("divisor of " + num +"are");
        for (int i=1;i<=num;i++){
            if (num % i == 0){
                System.out.println(" "+ i);
            }
        }
    }
}
