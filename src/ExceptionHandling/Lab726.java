package ExceptionHandling;

public class Lab726 {
    public static void main(String[] args) {
        System.out.println("Main completed");
        int r=new Hello3().show();
        System.out.println("main:" +r);
        System.out.println("main completed");
    }
}
class Hello3{
    int show(){
        int a=0;
        try {
            System.out.println("try block begins:" +a);
            a=10/0;
            System.out.println("try block ends:" +a);
            return a;
        }catch (ArithmeticException  e){
            a=20;
            System.out.println("ccatch block:" +a);
            return a;
        }finally {
            a=30;
            System.out.println("finally block:" +a);
            return a;
        }
    }
}
