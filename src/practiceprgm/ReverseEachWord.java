package practiceprgm;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s1 = "java is running";
        String[] s2 = s1.split(" ");
        for (String str : s2){
            String rev="";
            for (int i=str.length()-1;i>=0;i--){
                rev=rev+str.charAt(i);
            }
            System.out.print(rev+" ");
        }

              /* String str = "java full stack developer";
                String[] words = str.split(" ");

               for (String word : words) {
                    String reversed = new StringBuilder(word).reverse().toString();
                    System.out.print(reversed + " ");
                }*/
        String sent="java high level language";
        // word store current word and res store final output
        String word="";
        String res="";
        for (char ch : sent.toCharArray()){
            if (ch!=' ') {
                word = word + ch;
            }else {
                for (int i = word.length() - 1; i >= 0; i--) {
                    res = res + word.charAt(i);
                }
                res = res + " ";//adds space to maintain word separation.
                word = "";//resets the word variable so we can build the next word properly
            }
            }
            for (int i=word.length()-1;i>=0;i--){
                res=res+word.charAt(i);
            }

        System.out.println(res);

          String sts="java is ready";
          String[] words = sts.split(" ");
          for (String wrd : words){
              String rev = new StringBuilder(wrd).reverse().toString();
              System.out.print(rev + " ");
          }
    }
}
