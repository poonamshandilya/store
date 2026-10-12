package ExceptionHandling;

public class Lab728 {
    public static void main(String[] args) {
        System.out.println("main started");
         new Hello5().show("3");
        System.out.println("main completed");
    }
}
class Hello5{
    void show(String str){
        System.out.println("show() called");
        try {
            System.out.println("try bolck started");
            int a=Integer.parseInt(str);
            int b=10/a;
            System.out.println("try block completed:" +b);
            System.exit(0);
        }catch (ArithmeticException  e){
            System.out.println("catch block:");
        }finally {
            System.out.println("finally block");
        }
    }
}
