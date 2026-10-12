package Collection;
import java.util.*;
public class Set6 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Student(99));  set.add(new Student(99));
        set.add(new Student(99));  set.add(new Student(99));
        System.out.println(set);
    }
}
class Student{
    int sid;
    Student(int sid){
        this.sid = sid;
    }
    public String toString(){
        return ""+sid;
    }
}
