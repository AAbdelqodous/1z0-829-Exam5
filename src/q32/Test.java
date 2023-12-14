package q32;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Add(
                new Multiply(new Negate(5), new Negate(10)),
                new Add( new Negate(25), new Negate(25))
        );
        System.out.println( calculator.calc());
    }
}
