package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LenofElement {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("java", "spring", "sql");
        List<Integer>length = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(length);

        names.stream().map(String::length).forEach(System.out::println);

        names.stream().map(name -> name +"->"+ name.length()).forEach(System.out::println);
    }
}
