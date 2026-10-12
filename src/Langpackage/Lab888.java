package Langpackage;

import java.io.*;

public class Lab888 {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fis = new FileInputStream("D:\\info.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);){
            Object obj = ois.readObject();
            System.out.println(obj);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
class Studentz implements Serializable {
    int id;
    String name;
    long phone ;
    static int count =3;
    Studentz(int id, String name, long phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }
    public String toString(){
        return id+".."+name+"..."+phone;
    }
}
