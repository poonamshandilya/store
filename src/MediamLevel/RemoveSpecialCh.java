package MediamLevel;

public class RemoveSpecialCh {
    public static void main(String[] args) {
        String str = "ABC@23Ba!";
        String result="";
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)){
               result=result+ch ;
            }
        }
        System.out.println(result);
    }
}
