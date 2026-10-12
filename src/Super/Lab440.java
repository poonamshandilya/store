package Super;

public class Lab440 {
    public static void main(String[] args) {
        Hello h= new Hello(10,"jlc");
        h.show();

       // new Hello(10);
    }
}

class Hai{
    int a=10;
    Hai(int a){
        System.out.println("A cons");
        this.a=a;
    }
}
class Hello extends  Hai{
    String  a;
    Hello(int a1,String a2){
      super(a1);
      this.a=a2;
        System.out.println("b dc");
    }
   void show(){
       System.out.println(this.a);
       System.out.println(super.a);
   }
//   static int a=20;
//    static void show(){
//        int a=30;
//

}