package Comparator;
import java.util.*;
public class
Comparator2 {
    public static void main(String[] args) {
        TreeSet tset = new TreeSet(new SidComparator());
        tset.add(new Teacher(88,"Manish"));
        tset.add(new Teacher(44,"Sri"));
        tset.add(new Teacher(22,"Nivas"));
        tset.add(new Teacher(99, "Rahul"));
        tset.add(new Teacher(77, "Abhi"));
        Iterator it=tset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
class Teacher{
    int tid;  String name;
    Teacher(int tid, String name){
        this.tid=tid;   this.name=name;
    }
    public String toString(){
        return tid+"\t"+name;
    }
}
class SidComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        if (obj1 instanceof Teacher && obj2 instanceof Teacher){
            Teacher t1=(Teacher)obj1;
            Teacher t2=(Teacher)obj2;
            return t1.tid - t2.tid;

        }
        return 0;
    }
}
