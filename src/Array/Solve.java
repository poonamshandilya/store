package Array;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solve {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"rzat", 9000.0));
        list.add(new Employee(104,"sama", 7000.0));
        list.add(new Employee(103,"pooja", 6000.0));
        list.add(new Employee(102,"oojy", 8000.0));
        Collections.sort(list,new NameComparator());
        Collections.sort(list, new IdComparator());
       System.out.println(list);
    }
}
class Employee {
 int id;
 String name;
 double salary;

    public Employee( int id, String name,Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ",salary='"+ salary + '\''+
                '}';
    }
}
class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }

}
class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.id - e2.id;
    }
}
