package Oops;

public class Immutable {
    public static void main(String[] args) {
        Student st = new Student(99,"Ram");
        System.out.println(st);
    }
}
final class Student{
    private final int id;
    private final String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString() {
        return "sid";
    }
}
