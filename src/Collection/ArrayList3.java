package Collection;
import java.util.*;
import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        List  list = new ArrayList();
        list.add("Sri"); list.add("Nivas"); list.add("Dande");
        list.add("java"); list.add("Nivas"); list.add("JDBC");
        System.out.println(list);
        int x= list.indexOf("Nivas");
        System.out.println(x);
        int y= list.indexOf("Nivas");
        System.out.println(y);
    }
}
