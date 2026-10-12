package Langpackage;

public class Marker {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student1 st = new Student1(99);
        System.out.println(st.id);
        Student1 st2 =st.myclone();
        System.out.println(st2.id);
        System.out.println(st==st2);

    }
}
interface JLCCloneable{}
class Student1 implements JLCCloneable{
    int id;
    Student1(int id){
        this.id=id;
    }
    public Student1 myclone()throws CloneNotSupportedException{
        if (this instanceof  JLCCloneable){
            return new Student1(id);
        }else
            throw new CloneNotSupportedException("implement JLCCloneable");
    }
}
