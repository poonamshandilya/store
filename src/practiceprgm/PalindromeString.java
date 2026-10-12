package practiceprgm;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("it is palindrome ");
        }else {
            System.out.println("not palindrome");
        }
        //*******
       String strg = "MadaM";
        System.out.println(isPalindrome(strg));
    }
    static boolean isPalindrome(String strg){
        String str1 = strg.toUpperCase();
        int start =0;
        int end = strg.length()-1;
        while (start<end){
            if (strg.charAt(start)!=strg.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
