package Basic.com;

/*class Example{
    public static void main(String[] args) {
       Home obj = Home.people();
        //Home obj2 = Home.people();

        System.out.println(obj);
    }
}
class Home {
    private final static Home obj = new Home();
    private Home(){

    }
    public static Home people(){
        return obj;
    }
}*/
/*class Example{
    public static void main(String[] args) {
        Home obj = Home.getInstance();
        Home obj1 = Home.getInstance();
        Home obj2 = Home.getInstance();


    }
}
class Home{
    private static Home obj =new Home();
    private static Home obj1 =new Home();
    private static Home obj2 =new Home();
    private Home(){

    }
    public static Home getInstance() {
        if (Math.random() > 0.5) {
            return obj;
        }
        if (Math.random() < 0.5) {
            return obj1;
        }
        if (Math.random() == 0.5) {
            return obj2;
        }
    }
}*/

/*class Example{
    public static void main(String[] args) {
  Student1 obj = new Student1(20,"poonam");
  //int i=obj.getId();
  //String s=obj.getName();
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
  final class Student1{
    private final int id;
    private final String name;
    public Student1(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}*/
/*class Example{
    public static void main(String[] args) {
        Market obj = new Market(5620,"bgrenergy");
        System.out.println(obj.getId());
        System.out.println(obj.getName());



    }
}
final class Market{
    private final int id;
    private final String name;
    Market(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}*/
/*class Lab329{
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.show();
        Student stu2= new Student();
        stu1.show();
    }
}
class Student{
    int sid;
    String name;
    void show(){
        System.out.println(sid+"\t"+"sname");
    }
}*/





