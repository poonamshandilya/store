package Basic.com;

public class Overiding {
    public static void main(String[] args) {
        A a = new A();
          a.m1(10);
        B b = new B();
        b.m1(90);
        A a1 = new B();
         a1.m1(9);

    }
}
class A {
    void m1(int x){
        System.out.println("a clss");
    }

}
 class B extends A{
    void m1(int x){
     System.out.println("b class");
}

}
