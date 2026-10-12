package PracticeProgram;

public class MethodOverloading2 {
    public static void main(String[] args) {
        Hello4 h= new Hello4();
       // byte b=20;
       // h.add(b,b);
        //h.add(10,b);
       // h.show(null);
        h.show("jlc");
        h.show(h);
    }
}
class Hello4{
    void show(String  str){
        System.out.println("show(string)");
    }
    void show(Hello4 str){
        System.out.println("sow(Hello4)");
    }
    /*void add(byte a, int b){
        System.out.println("add(byte,int)");
    }
    void add(int a,byte b){
        System.out.println("add(int,byte");
    }*/
}
