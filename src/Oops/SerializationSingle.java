package Oops;

import PracticeProgram.Singleton;

import java.io.*;

public class SerializationSingle {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    SerSingle s1 = SerSingle.getRef();
    ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("file.txt"));
    oos.writeObject(s1);

    ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("file.txt"));
    SerSingle s2=(SerSingle)ois.readObject();
        System.out.println(s1==s2);

}
}


class SerSingle {
    private static SerSingle ref = new SerSingle();
    private SerSingle(){

    }
    public static SerSingle getRef(){
        return ref;
    }
}