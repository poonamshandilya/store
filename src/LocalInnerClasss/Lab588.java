package LocalInnerClasss;

public class Lab588 {
    public static void main(String[] args) {
        Outer out=new Outer();
        out.show();
    }
}
class Outer{
    int a=10;
    static int b=20;
    void show(){
        System.out.println("Outer  ->show()Begin");
        class Inner{
            void m1(){
                System.out.println("Inner ->m1()");
                System.out.println(a);
                System.out.println(b);
            }
        }
        new Inner().m1();
        System.out.println("Outer ->show()End");
    }
}
