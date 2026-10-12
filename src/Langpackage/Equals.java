package Langpackage;

public class Equals {
    public static void main(String[] args) {
        Studentt st1 = new Studentt(99,"sri");
        Studentt st2 = new Studentt(99,"sri");
        Studentt st3 = new Studentt(88,"nivas");
        Studentt st4=st1;
        System.out.println("using == oprt");
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1==st4);
        System.out.println(st2==st3);

        System.out.println("using equals()");
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(st4));
        System.out.println(st2.equals(st3));

    }
}
class Studentt{
    int id;
    String name;
    Studentt(int id,String name){
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj){
        if (obj instanceof Studentt){
            Studentt st = (Studentt) obj;
            return this.id==st.id && this.name.equals(st.name);
        }
        return false;
    }
}
