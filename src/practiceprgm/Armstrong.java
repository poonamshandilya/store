package practiceprgm;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int  temp = num;
        int sum =0;
        while (num!=0){
            int digit = num%10;
            sum = sum+(int) Math.pow(digit,3);
            num= num/10;
        }
        if (sum == temp){
            System.out.println("numer is armstrong " +temp);
        }else System.out.println( temp+" number is not armstrong");

       int digits = String.valueOf(num).length();
        while (num!=0){
      int digit = num%10;
       sum = (int) (sum+Math.pow(digit,digits));
       num = num/10;
        }
        if (sum==temp){
            System.out.println("armstrong " +temp);
        }else System.out.println("not armstrong " + temp);
    }
}
