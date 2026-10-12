package Collection;
import java.util.*;
import java.util.ArrayList;

public class Collection3 {
    public static void main(String[] args) {
       ArrayList al = new ArrayList();
        al.add("Sri"); al.add("Srinivas"); al.add("Dande");
        Object arr[]=al.toArray();
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
            arr[i]="JLC";
        }

        System.out.println(al);
    }
}
