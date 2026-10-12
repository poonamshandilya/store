package AnonymousClass;

public class Lab596 {
    public static void main(String[] args) {
       Hello1 h = new Hello1();
       h.m1();h.stu.sleeping();
    }
}
abstract class Person5{
    public abstract void sleeping();
}
class Hello1{
    Person5  stu = new  Person5(){
        public void sleeping(){
            System.out.println("Student ->sleeping()");
        }
    };
    void m1(){
        stu.sleeping();
    }
}
