package Has_A_relationship;

public class Aggregation {
    public static void main(String[] args) {
Teacher teacher = new Teacher("santos");
Departement departement = new Departement("IT",teacher);
departement.show();
    }
}
class Teacher{
    String name;
    Teacher( String  name){
        this.name=name;
    }
}
class Departement{
    String dptname;
    Teacher teacher;
    Departement(String dptname,Teacher teacher){
        this.dptname=dptname;
        this.teacher=teacher;
    }
    void show(){
        System.out.println(teacher.name + "teacher"+ dptname);
    }
}
