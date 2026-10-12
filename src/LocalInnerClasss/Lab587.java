package LocalInnerClasss;

public class Lab587 {
    public static void main(String[] args) {
        System.out.println("Hello Guys!");
    }
}
class Hello{
    {
        System.out.println("I.B -Hello");
        class Inner{}
    }
    static {
        System.out.println("S.B - Hello");
        class Inner{}
    }
    Hello(){
        System.out.println("D.C - Hello");
        class Inner{}
    }
    void m1(){
        System.out.println("m1()-Hello");
        class Inner{}
    }
}
