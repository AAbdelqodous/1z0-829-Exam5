package q23;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("d", "a", "mm", "bb", "zzz", "www");
        Comparator<String> lengthComp = (s1, s2) -> s1.length() - s2.length();
//        stream.sorted().forEach(System.out::println);
        stream.sorted(lengthComp.thenComparing(String::compareTo)).forEach(System.out::println);
    }
}
