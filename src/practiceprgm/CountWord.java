package practiceprgm;

public class CountWord {
    public static void main(String[] args) {
        String s1= "java developer pro";
        String[] words = s1.split("\\s+");
        int count = words.length;
        System.out.println(count);
    }
}
