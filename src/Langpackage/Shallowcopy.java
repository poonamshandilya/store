package Langpackage;

public class Shallowcopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Hai hai = new Hai(10);
        Hello hello = new Hello(20,hai);
        Hello hello1 = (Hello) hello.clone();
        System.out.println(hai.x);
        System.out.println(hello.y);
        System.out.println(hello1.y);
        //hello.show();
        //hello1.show();
        System.out.println(hello==hello1);
        System.out.println(hello.hai==hello1.hai);
        hello1.y=300;
        hello1.hai.x=200;
        System.out.println(hello1.hai.x);
        System.out.println(hello1.y);
       // hello.show();
       // hello1.show();
       // hello1.hai.x=111;
       // System.out.println(hello1.y+"...."+ hello.hai.x);
        // hello.show();
       // hello1.show();
    }
}
class Hai{
    int x;
    Hai(int x){
        this.x=x;
    }
}
class Hello implements Cloneable{
    int y;
    Hai hai;
    Hello(int y, Hai hai){
        this.y=y;
        this.hai=hai;
    }
//    void show(){
//        System.out.println("Hello->"+ y);
//        System.out.println("hai->"+ hai.x);
//    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}