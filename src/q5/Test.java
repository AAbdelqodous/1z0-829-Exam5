package q5;

public class Test {
    public static void main(String[] args) {
        switch ("HELLO") {
            case "HELLO":
                System.out.println(1);
                // No break statement inside 'case "HELLO":',
                // hence control enters in fall-through and executes remaining blocks until the break;
                // is found or switch block ends.
            default:
                System.out.println(2);
            case "null":
                System.out.println(3);
        }
    }
}
