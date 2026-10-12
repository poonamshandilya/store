package PracticeProgram;

public class Overloading {
    public static void main(String[] args) {
    // Haii h=new Haii();
     //h.m1();
      //b.SHOW("jlc");
      new  B3().m1();
    }
}
class A3{
   private void m1(){}
     //void m2(){}
}
class B3 extends A3{
    int m1(){
        return 0;
    }

}
/*class Helo{
    A m1(){
        return new A();
    }
}
class Haii extends Helo{
    A m1(){
       return new A();
    }
}
class A2{}
class B2 extends A2{}*/