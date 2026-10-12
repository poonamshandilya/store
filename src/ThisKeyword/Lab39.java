package ThisKeyword;

public class Lab39 {
    public static void main(String[] args) {
       Student s = new Student(99,"dande");
       s.show();
       Student s1 = new Student(88,"nivas");
       s1.show();
       Hello1 h = new Hello1(99);
       h.show();

    }
}
class Student{
  int sid;
  String sname;
   Student(int sid,String sname){
      System.out.println("Studnt 2 arg cos");
      this.sid=sid;
      this.sname=sname;
  }
  void show(){
      System.out.println(sid+"\t"+sname);
  }
}
class Hello1{
    int a;
    Hello1(){
        System.out.println("hello dc");
    }
    Hello1(int a){
        this ();
        System.out.println("hello 1 arg cons ");
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }
}
