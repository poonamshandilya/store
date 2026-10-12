package practiceprgm;

public class VowelConsonent {
    public static void main(String[] args) {
        String s1="RocK jAva";
       int vowel=0;
       int consonant=0;
       s1= s1.toLowerCase();
       for (int i=0;i<=s1.length()-1;i++){
           char ch=s1.charAt(i);
           if (ch>='a'&& ch<='z'){
               if (ch=='a'|| ch=='e' ||ch=='i' || ch=='o' || ch=='u'){
                   vowel++;
               }else{
                   consonant++;
               }
           }
       }
        System.out.println("this is vowel " + vowel );
        System.out.println("this is consonant " + consonant);
    }

}
