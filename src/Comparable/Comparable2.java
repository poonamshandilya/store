package Comparable;
import java.util.*;
public class Comparable2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Employee(88,"Ram"));   ts.add(new Employee(99,"rohan"));
        ts.add(new Employee(100,"rakhi"));    ts.add(new Employee(111,"shyam"));

        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class Employee implements Comparable{
    int eid;  String name;
    Employee(int eid,String name){
        this.eid=eid;   this.name=name;
    }

    public int compareTo(Object obj) {
       if (obj instanceof Employee){
           Employee em= (Employee) obj;
           return this.eid-em.eid;
       }
       return 0;
    }
    public String toString(){
        return eid+"\t"+name;
    }
}
