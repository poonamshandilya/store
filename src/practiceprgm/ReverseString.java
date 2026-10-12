package practiceprgm;

public class ReverseString {
    public static void main(String[] args) {
//        String  str = "java pprogram";
//        String reverse =  "";
//        for (int i=str.length()-1;i>=0;i--){
//            reverse =  reverse+str.charAt(i);
//        }
//        System.out.println(reverse);
////with split()
        String str = "java is baba";  // baba is java
        String[] words = str.split(" ");
        for (int i=words.length-1;i>=0;i--){
            System.out.print(words[i] + " ");
        }
//        //without split()
//        String str2 = "java full stack developer";
//        String word = "";
//        for (int i=str2.length()-1;i>=0;i--){
//            if (str2.charAt(i)==' '){
//                System.out.print(word+" ");
//                word=" ";
//            }else {
//                word=str2.charAt(i) + word;
//            }
//        }
//        System.out.println(word);
//
//        //reverse each word



              String s1= "JaVa  iS FantAstic";
                char[] arr = s1.toLowerCase().toCharArray();
                for (int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i]);
                }

                String str1= "java is sexy";
                String str2 = "";
                for (int i=str1.length()-1;i>=0;i--){
                    str2 = str2 + str1.charAt(i);
                }
        System.out.print(str2);

        String st1 = "java can run";
        String st2 ="";
        for (int i=st1.length()-1;i>=0;i--){
            st2=st2+st1.charAt(i);
        }
        System.out.println(st2);
            }
}
