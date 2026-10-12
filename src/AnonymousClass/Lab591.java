package AnonymousClass;

public class Lab591 {
    public static void main(String[] args) {
        Person p = new Student();
        p.sleeping();
        
    }
}
abstract class Person{
    public abstract void sleeping();
}
class Student extends Person{
    public void sleeping(){
        System.out.println("Student ->Sleeping()");
    }
}
