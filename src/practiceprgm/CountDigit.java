package practiceprgm;
import java.util.Scanner;
public class CountDigit {

    public static void main(String[] args) {
    int num = 6757;
    int count =0;
    if (num == 0){
        count=1;
    }else {
        while (num !=0){
           num= num/10;
           count++;
        }
    }
        System.out.println("count of digit " + count);



//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        System.out.println("Digits are:");
//
//        int count = 0;
//        if (num == 0) {
//            count = 1;
//        } else {
//            while (num != 0) {
//                num = num / 10;
//                count++;
//            }
//        }
//        System.out.println("number of digit" + count);
       // **********

    }
}

