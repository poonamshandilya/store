package InstanceInnerClass;

public class Lab573 {
    public static void main(String[] args) {
  Outer2 outobj = new Outer2();
  outobj.show();
    }
}
class Outer2{
    void show(){
        System.out.println("Outer  -> show()");
        Inner2 inobj = new Inner2();
        System.out.println(inobj.x);
        inobj.m1();
    }
    class Inner2{
        int x=11;
        void m1(){
            System.out.println("Inner2 -> m1()");
        }
    }
}
