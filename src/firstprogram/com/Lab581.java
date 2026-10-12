package firstprogram.com;

public class Lab581 {
    public static void main(String[] args) {
        new Outer().new Inner().show();
    }
}
class Outer{
    int a=11;
    class Inner{
        int a=22;
        void show(){
            System.out.println("Inner -> show()");
            int a=33;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Inner.this.a);
            System.out.println(Outer.this.a);
        }
    }
}
