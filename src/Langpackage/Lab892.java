package Langpackage;
import java.io.*;
public class Lab892 {
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);){
            Address ad = new Address("33/1", "Mathikere");
            Studnt st = new Studnt(99, "sri",8759739,ad);
            Studnt.count=9;
            oos.writeObject(st);
            System.out.println("object serialized");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Address{
    String id;
    String street;
    Address(){}
    Address(String id, String street){
        this.id=id;
        this.street=street;
    }
    public String toString(){
        return id+".."+street;
    }
}
class Studnt implements Externalizable {
    int sid;
    transient String name="XXXX";
    long phone = 8479759;
    static  int count =3;
    Address add;
    public Studnt(){}
    Studnt(int sid,String name, long phone,Address add){
        this.sid=sid;
        this.name=name;
        this.phone=phone;
        this.add=add;
    }
    public String toString(){
        return sid+"\t"+name+"\t"+phone+"\t\t"+count+"\n"+add;
    }
    public void writeExternal(ObjectOutput out)throws IOException{
        out.writeInt(count);
        out.writeObject(name);
        out.writeObject(add.id);
        out.writeObject(add.street);
    }
    public void readExternal(ObjectInput in)throws IOException, ClassNotFoundException{
        count=in.readInt();
        name=in.readObject().toString();
        add=new Address();
        add.id=in.readObject().toString();
        add.street=in.readObject().toString();
    }
}
