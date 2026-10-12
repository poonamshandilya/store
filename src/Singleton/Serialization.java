package Singleton;
import java.io.*;
public class Serialization {
    public static void main(String[] args) throws Exception {
    Singletone s1 = Singletone.getSingletone();
  ObjectOutputStream oos = new ObjectOutputStream(
           new FileOutputStream("obj.ser"));
      oos.writeObject(s1);
      ObjectInputStream ois = new ObjectInputStream(
              new FileInputStream("obj.ser"));
     // Singletone s2 = (Singletone) ois.readObject();
        //System.out.println(s1==s2);
        Object obj = ois.readObject();
        System.out.println(s1 == obj);

    }
}
class Singletone implements Serializable {
    private static Singletone singletone = new Singletone();
    private Singletone(){

    }
    public static Singletone getSingletone(){
        return singletone;
    }
//    protected Object readResolve() {
//        return getSingletone();
//    }

}
