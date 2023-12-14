package q34;

import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        var es = Executors.newSingleThreadExecutor();
        es.submit(() -> System.out.println("HELLO"));
        es.shutdown();
    }
}
