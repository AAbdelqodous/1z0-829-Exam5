package q10;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<? extends Object> list2 = list1;
        list2.remove("A"); // remove is non-generic method. remove(Object)
//        list2.add("C"); //add is a generic method. add(? extends Object) would be invoked
        // Compiler can never be sure whether passed argument is a subtype of UnknownType (extending from Object class).
        // Compiler works with reference types and not instances.
        // Simple way to remember is that as upper-bounded wildcard is used, hence add operation is not supported.
        System.out.println(list2);
    }
}
