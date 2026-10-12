package practiceprgm;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int rev =0;
        int temp=num;
        while (num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        if (rev==temp){
            System.out.println("palindrome " + temp);
        }else System.out.println("not palindrome " + temp);
    }
}
