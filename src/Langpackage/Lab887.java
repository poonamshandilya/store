package Langpackage;
import java.io.*;
public class Lab887 {
    public static void main(String[] args)throws Exception {
        try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);){
            Studenty st= new Studenty(99,"ranjan",987897876);
            Studenty.count=9;
            System.out.println(st);
            oos.writeObject(st);
            System.out.println("Object serialized");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
class Studenty implements Serializable{
    int id;
    String name;
    long phone ;
    static int count =3;
    Studenty(int id, String name, long phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }
    public String toString(){
        return id+".."+name+"..."+phone;
    }
}
