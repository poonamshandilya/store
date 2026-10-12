package AnonymousClass;

public class Lab595 {
    public static void main(String[] args) {
      Hello h = new Hello();
      h.m1();
      h.stu.sleeping();
    }
}
abstract class Person4{
    public abstract void sleeping();
}
class Hello{
    Person4 stu = new Person4(){
        public void sleeping(){
            System.out.println("student sleeping");
        }
    };
    void m1(){
        stu.sleeping();
    }

}
