package AnonymousClass;

public class Lab599 {
    public static void main(String[] args) {
      new Outer().new Inner().show();
    }
}
class A{
    int x=10;
}
class B{
    char x='j';
}
class Outer extends A{
    String x="JLC";
    class Inner extends B{
        boolean x=true;
        void show(){
            float x=10.0f;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Inner.this.x);
            System.out.println(Inner.super.x);
            System.out.println(Outer.this.x);
            System.out.println(Outer.super.x);
        }
    }
}
