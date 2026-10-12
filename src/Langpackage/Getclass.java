package Langpackage;

public class Getclass {
    public static void main(String[] args) {

//        showClassinfo("jlc");
//        Studento s1 = new Studento();
//        showClassinfo(s1);
        Object obj = new Object();
        showClassinfo(obj);

    }
    static void showClassinfo(Object obj){
        Class cls= obj.getClass();
        System.out.println("Class name " + cls.getName());
        Class scls = cls.getSuperclass();
        if (scls!=null)
            System.out.println("super class" + scls.getName());
        else
            System.out.println("no supr class");
    }
}
//class Person{}
//class Studento extends Person{}

