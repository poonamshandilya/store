package Interface;

public class Lab545 {
    public static void main(String[] args) {
      //Inter6 ref=new Hai();
      //ref.m1();
      //ref.m2();
        Hello2 h= new Hello2();
        System.out.println(h.A);
        System.out.println(h.B);
        h.m1();
        h.m2();
        h.m3();
    }
}
interface Inter6{
    void m1();
    int A =10;
    int B=20;
    void m2();
}
interface Inter7{
    void m2();
    void m3();
    int C=30;
}
class Hello2 implements Inter6,Inter7{
public void m1(){
    System.out.println("hello m1()");
}

    @Override
    public void m2() {
        System.out.println("hellom m2()");
    }

    @Override
    public void m3() {
        System.out.println("hello m3()");
        System.out.println(B);
        System.out.println(C);
    }
}
/*class Hai extends Hello2{
    public void m2(){
        System.out.println("Hai m2()"+B);
    }
    void m3(){
        System.out.println("Hai m3()");
    }
}*/