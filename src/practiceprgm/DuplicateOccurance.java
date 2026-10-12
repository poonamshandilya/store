package practiceprgm;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateOccurance {
    public static void main(String[] args) {
        String s1= "developer hii";

        Set<Character> set = new LinkedHashSet<>();
        //convert string to character and add to set
        for (char ch : s1.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb= new StringBuilder();
        // now we append(add) character one by one
        for (char ch : set){
            sb.append(ch);
        }
        System.out.println(sb.toString());//bydefault its implemented but for best practice
        // tostring() convert stringbuilder to string
    }
}
