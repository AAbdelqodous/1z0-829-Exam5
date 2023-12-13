package q4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Base b = new Derived();
        try {
            b.print();
            // Reference variable 'b' is of Base type and hence for compiler,
            // call to b.print(); is to method print() of Base, which throws IOException.
//        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            System.out.print("AWE");
        } finally {
            System.out.print("SOME");
        }
    }
}
