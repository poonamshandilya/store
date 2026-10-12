package Singleton;

public class Lab703 {
    public static void main(String[] args) {
        Helloo h = Helloo.getHelloo();
        System.out.println(h);
    }
}
class Helloo{
    private static Helloo helloo = null;
//    static {
//        helloo = new Helloo();
//    }
//    private Helloo(){
//    }
//    public static Helloo getHelloo(){
//        return helloo;
//    }
    private Helloo(){

    }
    public static Helloo getHelloo(){
        if (helloo==null)
            helloo=new Helloo();
        return helloo;
    }
}
