package Langpackage;
import java.io.*;
public class Lab889 {
    public static void main(String[] args)throws Exception {
        try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);){
            Studentw st = new Studentw(99,"romi",3485859);
            Studentw.count=9;
            System.out.println(st);
            oos.writeObject(st);
            System.out.println("object serialized");
        }catch (Exception e){
            e.printStackTrace();
        }
        try(FileInputStream fis = new FileInputStream("D:\\info.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);){
            Object obj = ois.readObject();
            System.out.println(obj);
            System.out.println("object deserilized");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
//class Person {
//    String name = "XXXX";
//    long phone = 877878;
//}
//class Studentw extends Person implements Serializable{
//    int id;
//    static int count = 3;
//    Studentw(int id, String name, long phone){
//        this.id=id;
//        this.name=name;
//        this.phone=phone;
//    }
//    public String toString(){
//        return id+"..."+name+"..."+phone;
//    }
//}
class Studentw implements Serializable{
    int id;
    transient String name ="XXXX";
    long phone=878776899;
    static int count =3;
    Studentw(int id, String name,long phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }
    public String toString(){
        return id+"..."+name+"..."+phone;
    }
}
