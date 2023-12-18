package q21;

public class Test {
    final static StringBuilder sb = new StringBuilder("A");
    static int x = 2;
    public static void main(String[] args) {
        switch (x) {
            default:
                sb.append("B"); //Line n1
            case 1, 3, 5, 7, 9:
                // Because of the fall-through logic, Line n2 is also executed, 'sb' refers to ["AZBC"].
                // Line n3 prints 2:AZBC.
                sb.append("C"); //Line n2
                break;
        }
        System.out.println(x + ":" + sb.toString()); //Line n3
    }

    static {
        sb.append("Z");
    }

    {
        x += 1;
        // We are not creating the instance of Test class,
        // so instance initializer block will not be executed.
        // If static variable declaration / initialization statements are present along with static initializer blocks,
        // then these are invoked in top to bottom order. So, for the given code.
    }
}
