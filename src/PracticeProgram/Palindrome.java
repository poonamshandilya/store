package PracticeProgram;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;
        while (num!=0){
            int remainder = num%10;
            rev= rev*10+remainder;
            num = num/10;
        }
        if (temp == rev)
            System.out.println(temp+"is palindrome");
        else System.out.println(temp+"is not palindrome");
    }
}
