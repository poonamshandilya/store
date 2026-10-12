package Comparable;
import java.util.*;
public class Comparable3 {
    public static void main(String[] args) {
        System.out.println("**STUDENT INFO**");
        TreeSet set = new TreeSet();
        set.add(new Student(87,"Sri"));
        set.add(new Student(99,"Dande"));
        set.add(new Student(12,"SD"));
        set.add(new Student(45,"Nivas"));
//        Iterator it = set.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());
        System.out.println(set);

    }
}


class Student implements Comparable{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int compareTo(Object obj){
        if (obj instanceof Student){
            Student st = (Student) obj;
           // return this.id-st.id;
            return st.id-this.id;
        }
        return 0;
    }
    public String toString(){
        return id+".."+name;
    }


}
