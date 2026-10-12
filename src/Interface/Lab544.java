package Interface;

public class Lab544 {
    public static void main(String[] args) {
Inter5 ref =null;
//ref=new Hello();
ref.m1();   ref.m2();
    }
}
interface Inter5{
    void m1();
    public abstract void m2();
    int A =10;
    public final int B=20;
}
class hello implements Inter5{

    @Override
    public void m1() {
        System.out.println("Hello m1()"+A);
    }

    @Override
    public void m2() {
        System.out.println("hello m2()"+B);
    }

}
