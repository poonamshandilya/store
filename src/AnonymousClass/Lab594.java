package AnonymousClass;

public class Lab594 {
    public static void main(String[] args) {
       Person3 stu = new Person3(){
           public void sleeping(){
               System.out.println("student ->sleeping()");
           }
       } ;
    }
}
abstract class Person3{
    public abstract void sleeping();
}