package PracticeProgram;

public class Block {
    public static void main(String[] args) {
//Hello2 h=new Hello2();
        //Hello2 h=null;
        //System.out.println("Ref created");
        //new Hello2();
        //System.out.println("main"+Hello2.a);
        System.out.println("main block");
    }
    static {
        System.out.println("static block");
    }
}
/*class Hello2{
    static int a;
    int b;

  // static int a=10;
   /* static {
        a=10;
        System.out.println("initialized" +a);
    }*/
   /*{
       System.out.println("instance Block");
   }
   static {
       a=10;
       b=20;
       System.out.println("static block");
   }

}*/