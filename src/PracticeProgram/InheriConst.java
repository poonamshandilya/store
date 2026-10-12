package PracticeProgram;

import java.util.logging.SocketHandler;

public class InheriConst {
    public static void main(String[] args) {
        new C();
    }
}
class A{
    A(){
        System.out.println("A->D.c");
    }
    static {
        System.out.println("A->s.b");
    }
    {
        System.out.println("A->I.b");
    }
}
class B extends A{
    B(){
        System.out.println("B->D.c");
    }
    static {
        System.out.println("B->s.b");
    }
    {
        System.out.println("B->i.b");
    }
}
class C extends  B{
    C(){
        System.out.println("C->D.c");
    }
    static {
        System.out.println("C->S.b");
    }
    {
        System.out.println("C->i.b");
    }
}
