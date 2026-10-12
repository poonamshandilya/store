package Constructor;

public class Lab329 {
    public static void main(String[] args) {
        Student s1= new Student(33,"sri");
       s1.show();

Student s2=new Student(22,"ram");
s2.show();
    }
}
class Student{
    int sid;
    String sname;
    Student(int id, String name){
        System.out.println("default constructor");
        sid=id;
        sname=name;
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
