package q44;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var str1 = List.of("A", "E", "I", "O", "U").stream()
                .reduce("_", String::concat);
        var str2 = List.of("A", "E", "I", "O", "U").parallelStream()
                .reduce("_", String::concat);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));

    }
}
