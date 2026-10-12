package Comparator;
import java.util.*;
public class Comparator3 {
    public static void main(String[] args) {
        TreeSet  tset = new TreeSet(new NameComparator());
        tset.add(new Studenty(88,"Manish"));
        tset.add(new Studenty(44,"Sri"));
        tset.add(new Studenty(22,"Nivas"));
        tset.add(new Studenty(99,"Rahul"));
        Iterator it=tset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
class Studenty{
    int sid;  String name;
    Studenty(int sid, String name){
        this.sid=sid;  this.name=name;
    }
    public String toString(){
        return sid+"\t"+name;
    }
}
class NameComparator implements Comparator{
    public int compare(Object ob1, Object ob2){
        if (ob1 instanceof Studenty && ob2 instanceof Studenty){
            Studenty s1=(Studenty)ob1;
            Studenty s2=(Studenty)ob2;
            return s1.name.compareTo(s2.name);
        }
        return 0;
    }
}
