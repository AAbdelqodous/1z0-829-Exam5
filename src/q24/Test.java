package q24;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        try (Scanner scanner = new Scanner(System.in)){
            String text = scanner.nextLine();
            System.out.println(text);
            scanner.close();
            text = scanner.nextLine();
        }
    }
}
