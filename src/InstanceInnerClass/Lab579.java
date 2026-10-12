package InstanceInnerClass;

public class Lab579 {
    public static void main(String[] args) {
        System.out.println("Hello Guys!");
    }
}
class Outer8{
    interface inter1{}
    interface inter2 extends inter1{}
    class Inner1 implements inter2{}
    class Inner2 extends Inner1{}
    private abstract class Inner3{}
    class Hello extends Inner3{}
}
