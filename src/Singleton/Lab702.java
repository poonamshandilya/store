package Singleton;

public class Lab702 {
    public static void main(String[] args)throws CloneNotSupportedException {
       Hello h = Hello.getHello();
        System.out.println(h);
        Helloo h2 = (Helloo) h.clone();
        System.out.println(h2);
    }
}
class Hello implements Cloneable{
    private static Hello hello = new Hello();
    private Hello(){

    }
    public static Hello getHello(){
        return hello;
    }
    protected Object clone(){
        return this;
    }
}

