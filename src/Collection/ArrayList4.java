package Collection;
import java.util.*;
import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        List  list = new ArrayList();
        list.add("Sri"); list.add("Nivas"); list.add("Dande");
        list.add("java"); list.add("Nivas"); list.add("JDBC");
        List list2=list.subList(1,3);
        System.out.println(list);
        System.out.println(list2);
    }
}
