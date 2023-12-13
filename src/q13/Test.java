package q13;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        // HashMap and LinkedHashMap can accept 1 null key but TreeMap cannot accept null keys.
        // LinkedHashMap by default keeps an insertion order so every time you iterate the map, you get the same result.
        map.put(null, "zero");
        map.put(1, "one");

        System.out.println(map);
    }
}
