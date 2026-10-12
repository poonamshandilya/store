package Basic.com;

public class Constructor {
    public static void main(String[] args) {
    Studentt obj =new Studentt(34,"poonam");
        System.out.println(obj.roll);
        System.out.println(obj.name);

        Studentt obj1 = new Studentt(21);
        System.out.println(obj1.roll);

    }
}
class Studentt{
    int roll;
    String name;
    Studentt(int roll,String name){
        this.roll= roll;
        this.name= name;
    }

    Studentt(int roll) {
        this.roll = roll;


    }
}

