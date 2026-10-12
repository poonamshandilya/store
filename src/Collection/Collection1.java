package Collection;
import java.util.*;
import java.util.ArrayList;

public class Collection1 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        System.out.println(col);
        System.out.println("size:"+col.size());
        System.out.println("Empty:"+col.isEmpty());
        System.out.println();
        col.add("Sri");   col.add("Nivas");  col.add("Srini");
        col.add("SD");  col.add("Dande");
        System.out.println(col);
        System.out.println("size:"+col.size());
        System.out.println("Empty:"+col.isEmpty());
    }
}
