package PracticeProgram;

public class SuperK {
    public static void main(String[] args) {
        //Hello7 h=new Hello7();
        //Hello7.show();
        new Q();
    }
}
class P{
    P(int p){
        System.out.println("A(int)cons");
    }
}
class Q extends P{
    Q(){
        super(10);
        System.out.println("Q->d.c");
    }
}
/*class Hai1{
    static int a=10;
}
class Hello7 extends Hai1{
    static int a=20;
    static void show(){
        int a=30;
        System.out.println(a);
        System.out.println(Hello7.a);
        System.out.println(Hai1.a);
    }
}*/
