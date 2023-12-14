package q33;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8);
        list.replaceAll(i -> i + 1);
        System.out.println(list);
    }
}
