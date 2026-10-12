package PracticeProgram;

public class MethodOvrloading {
    public static void main(String[] args) {
       Hello3 h= new Hello3();
       String a=h.add(99,"jlc");
        System.out.println(a);
        String b=h.add("jlc",99);
        System.out.println(b);
    }
}
class Hello3{
    String add(int b,String a){
        System.out.println("add(int,STring)");
        return a+b;
    }
    String add(String a, int b){
        System.out.println("add(string,int)");
        return  a+b;
    }
    /*int add(int a,int b,int c){
        System.out.println("add(int,int,int)");
        return a+b+c;
    }*/
}
