package practiceprgm;

public class RevWrdWthtSpilt {
    public static void main(String[] args) {
        String str = "java full stack developer";
        String word =  "";
        for (int i=0;i<=str.length();i++){
            if (i==str.length() || str.charAt(i)==' '){
                for (int j=word.length()-1;j>=0;j--){
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word="";
            }else {
                word=word+str.charAt(i);
            }

        }
    }
}
