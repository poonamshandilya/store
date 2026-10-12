package ExceptionHandling;

public class Lab720 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            int res = 10/0;
            System.out.println("Result " +res);
        }catch (NumberFormatException e){
            System.out.println("invalid input");
        }
        finally {
            System.out.println("finally block");
            System.out.println("main completed");
        }
    }
}
