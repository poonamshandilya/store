package MediamLevel;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s1="abcadadbcadb";
        System.out.println(findlongest(s1));
    }
    public static int findlongest(String s1){
        Set<Character> set = new HashSet<>();
        int left =0;
        int maxlength=0;
        for (int right=0;right<s1.length();right++){
            char ch =s1.charAt(right);
            while (set.contains(ch)){
                set.remove(s1.charAt(left));
                left++;
            }
            set.add(ch);
            maxlength = Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }
}
