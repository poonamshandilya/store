package ExceptionHandling;

public class Lab721 {
    public static void main(String[] args) {
        System.out.println("main started");
        try {
            int res = 10/3;
            System.out.println("result: +res");
        }catch (Exception e){
            System.out.println("invalid input");
        }
        System.out.println("main completed");
    }
}
