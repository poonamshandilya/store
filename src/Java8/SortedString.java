package Java8;

import java.util.stream.Collectors;

public class SortedString {
    public static void main(String[] args) {
        String str = "absdcahuz";
        String sorted = str.chars().sorted().mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());
        System.out.println("sorted character  " + sorted);
    }
}
