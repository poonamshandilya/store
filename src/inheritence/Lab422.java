package inheritence;

public class Lab422 {
    public static void main(String[] args) {
//        B bobj = new B();
//        bobj.m1();
//        bobj.m2();
//
//        C cobj = new C();
//        cobj.m1();
//        cobj.m3();
        new C();
    }
}
//class A{
//    void m1(){
//        System.out.println("A m1()");
//    }
//}
//class B extends A{
//    void  m2(){
//        System.out.println("B M2()");
//    }
//}
//class C extends A{
//    void m3(){
//        System.out.println("c m3()");
//    }
//}
class A{
    A(){
        System.out.println("A dc");
    }
    static {
        System.out.println("A sb");
    }
    {
        System.out.println("A ib");
    }
}
class B extends A{
    B(){
        System.out.println("B dc");
    }
    static {
        System.out.println("B sb");
    }
    {
        System.out.println("B ib");
    }
}
class C extends B{
    C(){
        System.out.println("C Dc");
    }
    static {
        System.out.println("C sb");
    }
    {
        System.out.println("C ib");
    }
}