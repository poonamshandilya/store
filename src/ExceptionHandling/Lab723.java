package ExceptionHandling;

public class Lab723 {
    public static void main(String[] args) {
        System.out.println("Main started");
        int r=new Hello().show();
        System.out.println("main:+r");
        System.out.println("Main()Completed");
    }
}
class Hello{
    int show(){
        int a=0;
        try {
            System.out.println("try bolck begins:" +a);
            a=10/4;
            System.out.println("try bolck ends:" +a);
            return a;
        }catch (ArithmeticException  e){
            a=20;
            System.out.println("catch bolck:" +a);
            return a;
        }finally {
            a=30;
            System.out.println("finally bolck:" +a);
        }
    }
}
