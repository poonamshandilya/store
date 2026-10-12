package Singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton s1 = Singleton.getSingleton();
        Constructor<Singleton> c = Singleton.class.getDeclaredConstructor();
        c.setAccessible(true);
        Singleton s2 = c.newInstance();
        System.out.println(s1==s2);
    }
}
class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){

    }
    public static Singleton getSingleton(){
        return singleton;
    }
}*/
