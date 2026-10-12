package ExceptionHandling;

public class Lab719 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            int res = 10/0;
            System.out.println("result: +res");
        }catch (NumberFormatException e){
            System.out.println("invalid input");
        }
        System.out.println("main completed");
    }
}
