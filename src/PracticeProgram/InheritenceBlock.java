package PracticeProgram;

public class InheritenceBlock {
    public static void main(String[] args) {
       // System.out.println(Hello6.a);
        Hello6 h=new Hello6();
    }
}
class Hai{
  // int a=99;
    {
        System.out.println("Hai->i.b");
    }
    static {
        System.out.println("Hai->s.b");
    }
}
class Hello6  extends Hai{
   //int b=88;
    {
        //System.out.println("Hello->S.b"+a);
        System.out.println("Hello->i.b");
    }
    static {
        System.out.println("Hello->s.b");
    }
}
