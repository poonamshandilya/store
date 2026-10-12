package Singleton;

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
Singleton s1 = Singleton.getSingleton();
Singleton s2 = (Singleton) s1.clone();
        System.out.println(s1==s2);
    }
}
class  Singleton implements Cloneable{
    private static Singleton singleton = new Singleton();
    private Singleton(){

    }
    public static Singleton getSingleton(){
        return singleton;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
