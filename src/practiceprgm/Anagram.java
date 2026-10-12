package practiceprgm;

public class Anagram {
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        System.out.println(areAnagram(s1,s2));
    }
    static boolean areAnagram(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        int[] charcount = new int[256];
        for (int i=0;i<s1.length();i++){
        charcount[s1.charAt(i)]++;
        charcount[s2.charAt(i)]--;
        }
        for (int count : charcount){
            if (count!=0){
                return false;
            }
        }

        return true;

    }


}
