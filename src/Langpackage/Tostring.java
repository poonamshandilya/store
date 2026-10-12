package Langpackage;

public class Tostring {
    public static void main(String[] args) {
//        Studentx st1 = null;
//        System.out.println(st1);
//        st1 = new Studentx(99, "sri");
//        System.out.println(st1);
//        String str = new String("java learing cntere");
//        System.out.println(str);
//        Integer ref = new Integer(123);
//        System.out.println(ref);
//        Studentx st1 =new Studentx(99,"sri");
//        System.out.println(st1);
//        System.out.println("\n*** default implementation");
//        String cname =st1.getClass().getName();
//        int hc = st1.hashCode();
//        String hx = Integer.toHexString(hc);
//        String msg = cname+"@"+hx;
//        System.out.println(msg);
        Studentx st1 =new Studentx(99,"sri");
        Studentx st2 =new Studentx(88,"Nivas");
        System.out.println(st1);
        System.out.println(st2);

    }
}
class Studentx{
    int id;
    String name;
    Studentx(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+".."+ name;
    }
}
