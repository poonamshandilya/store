package Collection;
import java.util.*;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sri"); list.add("Nivas"); list.add("Dande"); list.add("java");
        System.out.println(list);
        list.set(1,"java");
        System.out.println(list);
        Object obj=list.get(2);
        System.out.println(obj);
        System.out.println(list.remove("java"));

    }
}
