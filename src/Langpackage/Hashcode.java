package Langpackage;

public class Hashcode {
    public static void main(String[] args) {
        Student st1 = new Student(99, 312456789);
        Student st2 = new Student(99, 312456789);
        Student st3 = new Student(88, 456953789);
        Student st4=st1;

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1==st4);
        System.out.println(st3==st4);
    }
}
class Student{
    int id;
    long phone;
    Student(int id, long phone){
        this.id=id;
        this.phone=phone;
    }
}
