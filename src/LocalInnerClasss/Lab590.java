package LocalInnerClasss;

public class Lab590 {
    public static void main(String[] args) {
       Outer2.show();
    }
}
class Outer2{
    int  a=10;
    static int b=20;
    static void  show(){
        System.out.println("Outer ->show()Begin");
        class Inner{
            void m1(){
                System.out.println("Inner ->m1()");
                System.out.println(b);
            }
        }
        new Inner().m1();
        System.out.println("Outer ->show()End");
    }
}
