package PracticeProgram;

public class PolymorphismP {
    public static void main(String[] args) {
       /* Person p=null;
        p=new Student();
        Student stu = (Student) p;
        stu.reading();
        p=new Employee();
        Employee emp= (Employee) p;
        emp.working();*/
        C4 c=new C4();
        c.show();
        c.x=true;
        B4 bref=c;   bref.x="sri";
        A4 aref=c;   aref.x=88;
        c.show();
       // obja.x=99;
        //System.out.println(obja.x);
    }
}
/*class Person{
    void eating(){
        System.out.println("Person eating()");
    }
    void walking(){
        System.out.println("person walking");
    }
    static void sleeping(){
        System.out.println("person sleeping()");
    }
}
class Employee extends Person{
    void walking(){
        System.out.println("Employee walking");
    }
    static void sleeping(){
        System.out.println("employee()");
    }
    void working(){
        System.out.println("employee working()");
    }
}
class Student extends Person{
    void walking(){
        System.out.println("student walking()");
    }
    static void sleeping(){
        System.out.println("student sleeping");
    }
    void reading(){
        System.out.println("Student reading()");
    }
}*/
class A4{
    int x=10;
}
class B4 extends A4{
    String x="jlc";
    //void show(){
       // System.out.println(x);
       // System.out.println(super.x);
        //B4 ref1=this;
       // A4 ref2=this;
       // System.out.println(ref1.x+"\t"+ref2.x);
    //}
}
class C4 extends B4{
    boolean x=false;
    void  show(){
        char x='j';
        System.out.println(x);
        C4 cref=this;
        B4 bref=this;
        A4 aref=this;
        System.out.println(cref.x);
        System.out.println(bref.x);
        System.out.println(aref.x);
    }
}
