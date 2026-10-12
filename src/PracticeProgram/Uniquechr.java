package PracticeProgram;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Uniquechr {
    public static void main(String[] args) {
        String str = "java program";
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
        for (int i=0;i<str.length();i++){
            int count =0;
            char ch = str.charAt(i);
            if (ch==  ' ') {
              continue;}

            for (int j=0; j<str.length(); j++){
                if (ch == str.charAt(j)){
                    count++;
                }
            }
            if (count>1){
                System.out.println(str.charAt(i)+" unique element " +count);
            }

        }
    }
}
