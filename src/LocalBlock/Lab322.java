package LocalBlock;

public class Lab322 {
    public static void main(String[] args) {
        //Hello h=new Hello();
        System.out.println("main");

        {
            int a=10;
            System.out.println("i am local block"+a);
        }
     int a=90;
        System.out.println("i am main"+a);

    }
}
/*class Hello{
    static  int a;
    {
        System.out.println("iib");
        {
            System.out.println("i am local iib");
        }
    }
    static {
        System.out.println("i am sib");
        {
            System.out.println("i am local sib");
        }
    }
}*/
