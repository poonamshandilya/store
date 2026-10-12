package Oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleton {


    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
       Constructor<RefSingle> c = RefSingle.class.getDeclaredConstructor();
    c.setAccessible(true);
    RefSingle s1 = RefSingle.getRef();
    RefSingle s2 = c.newInstance();
        System.out.println(s1==s2);
    }
}
class RefSingle {
    private static RefSingle ref = new RefSingle();
    private RefSingle(){

    }
    public static RefSingle getRef(){
        return ref;
    }
}