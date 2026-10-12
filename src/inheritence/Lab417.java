package inheritence;

public class Lab417 {
    public static void main(String[] args) {
//        Hai hai = new Hai();
//        System.out.println(hai.a);
        //System.out.println(hai.b);

       // Hello hello= new Hello();
        //System.out.println(Hello.a);
        Hello.show();

    }
}
class Hai{
     //int a=99;
    static void show(){
        System.out.println("hai show()");

    }
    static {
        System.out.println("hai sb");
    }
}
class Hello extends Hai{
    //int b=88;

    static {
        System.out.println("hello sb" );
    }
}
