package PracticeProgram;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        System.out.println("MMain started");
        //Exception ex1=new ClassNotFoundException();
        //Exception ex2=new NullPointerException();
       // System.out.println(ex1 instanceof RuntimeException);
       // System.out.println(ex2 instanceof RuntimeException);
       // Hello h=new Hello();
        try {
         // int res=10/0;
        }catch (Exception e){

        }
        System.out.println("main completed");
    }
}
       // int r=new Helloh().show();
        //System.out.println("main"+r);
        //new Helloh().show("0");
       /* try {
            new Helloh().show();
        }catch (Exception  e){
            System.out.println("\ncatch block");
            System.out.println("Ex"+e);
            System.out.println("Message"+e.getMessage());
            System.out.println("Cause"+e.getCause());
            System.out.println();
            e.printStackTrace();
        }
        System.out.println("main  completed");
    }
}*/
/*class Helloh {
    /*int show(){
        int a=0;
        try {
            System.out.println("try begins"+a);
            a=10/4;
            System.out.println("try block ends"+a);
            return  a;
        }
        catch (ArithmeticException e){
            a=20;
            System.out.println("catch block "+a);
            return a;
        }finally {
            a=30;
            System.out.println("finally block"+a);
           int arr[]=new int[-1];
        }
    }*/
   /* void show(String str){
        System.out.println("show() called");
        try {
            System.out.println("try block started");
            int a=Integer.parseInt(str);
            int b=10/a;
            System.out.println("try block completed"+b);
            //System.exit(0);
        }catch (ArithmeticException e){
            System.out.println("catch block");
            System.exit(0);
        }finally {
            System.out.println("finallly block");
        }*/
    /*void show(){
        System.out.println("show()begins");
        new Hlww().m1();
        System.out.println("show()ends");
    }

}
class Hlww {
    void m1() {
        System.out.println("Hlww->m1()begins");
        new Hiii().m2();
        System.out.println("Hlww->mm1()ends");
    }
}
class Hiii{
    void m2(){
        System.out.println("Hiii->m2()begins");
        new Bye().m3();
        System.out.println("Hiii->m2()ends");
    }
}
class Bye{
    void m3(){
        System.out.println("Bye->m3()begins");
        int x=10/0;
        System.out.println("Bye->m3()ends");
    }
}
*/