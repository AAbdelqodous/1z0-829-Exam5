package q17;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> list = List.of(100, 100, 100); //Line n1
        Collection<Integer> set = new LinkedHashSet<>(list); //Line n2
//        set.forEach((set) -> System.out.print(set)); //Line n3
        // At Line n3, lambda parameter 'set' has already been declared in the enclosing scope and
        // that is why Line n3 causes compilation error.
        set.forEach((s) -> System.out.print(s)); //Line n3
    }
}
