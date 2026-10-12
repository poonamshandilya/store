package Interface;

public class Lab542 {
    public static void main(String[] args) {
        System.out.println("hello gys");
    }
}
interface Inter3 {
    void m1();
    public abstract void m2();
    int A =10;
    public final int B=20;
}
abstract class Hello implements Inter3{}