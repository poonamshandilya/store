package StaticInnerClass;

public class Lab586 {
    public static void main(String[] args) {
       Outer2 outob = new Outer2();
       outob.showOuter();
    }
}
class Outer2{
    void showOuter() {
        System.out.println("Outer ->showOuter()");
        System.out.println(new Inner().x);
        System.out.println(Inner.y);
        Inner.m1();
    }
    static class Inner{
        int x=11;
        static int y =22;
        static void m1(){
            System.out.println("Inner -> m1()");
        }
    }
}
