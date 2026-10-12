package ExceptionHandling;

public class Lab725 {
    public static void main(String[] args) {
        System.out.println("Main started");
        int r=new Hello2().show();
        System.out.println("main:" +r);
        System.out.println("Main completed");
    }
}
class Hello2{
    int show(){
        int a=0;
        try {
            System.out.println("try block begins:" +a);
            return a;
        }catch (ArithmeticException e){
            a=20;
            System.out.println("catch block:"  +a);
            return a;
        }finally {
            a=30;
            System.out.println("finally block:" +a);
            return a;
        }
    }
}
