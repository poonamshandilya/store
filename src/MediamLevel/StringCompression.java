package MediamLevel;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccdaa";
        System.out.println(iscompression(str));
        System.out.println(compress(str));
    }
    public static String iscompression(String str){
        String result = "";
        int count=1;
        for (int i=0;i<str.length();i++){
            if (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                result = result+str.charAt(i) + count;
                count=1;
            }
        }
        return result;
    }
    public static String compress(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return sb.toString();
    }
}
