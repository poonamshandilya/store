package Basic.com;

/*import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        //153,370,9474

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();


        int temp = num;
        int sum = 0;
        int n = String.valueOf(num).length();



        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }


        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }


}*/

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int len = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            len++;
        }
        int num1 = num;
        while (num1 > 0) {
            int rem = num1 % 10;

                sum += Math.pow(rem,len);
                num1 = num1 / 10;


        }
        if (sum == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not Armstrong");
        }

    }
}

