package Interface;

public class Lab543 {
    public static void main(String[] args) {
        System.out.println("hello gys");
    }
}
interface Inter4{
    void m1();
    public abstract void m2();
    int A=10;
    public final int B=20;
}
class Hello1 implements Inter4{

    @Override
    public void m1() {
        System.out.println("Hello m1()");
    }

    @Override
    public void m2() {
        System.out.println("helllo m2()");
    }

}
