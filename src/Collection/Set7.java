package Collection;
import java.util.*;
public class Set7 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Studentx(99));
        set.add(new Studentx(99));
        set.add(new Studentx(99));
        set.add(new Studentx(99));
        System.out.println(set);
    }
}

class Studentx{
    int sid;
    Studentx(int sid){
        this.sid=sid;
    }
    public String toString(){
        return ""+sid;
    }
    public int hashCode(){
        System.out.println("** hashCode() **");
        return sid;

    }
    public boolean equals(Object obj){
        System.out.println("** equals() **");
        if (obj instanceof Studentx){
            Studentx st = (Studentx)obj;
            return this.sid==st.sid;
        }
        return false;
    }

}
