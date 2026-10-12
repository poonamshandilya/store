package PracticeProgram;

public class Fibonacci {
    public static void main(String[] args) {
        int n =8;
        int first = 0;
        int second = 1;
        int next;
        System.out.println("fibonacci series");
        for (int i=1;i<=n; i++){
            System.out.println(first+" ");
            next= first+second;
            first = second;
            second= next;
        }
    }
}
