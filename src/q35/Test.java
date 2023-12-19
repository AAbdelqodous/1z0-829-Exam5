package q35;

public class Test {
    public static void main(String[] args) {
        var sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length());
        //  creates a StringBuilder instance, whose internal char array's length is 100
        //  but length() method of StringBuilder object returns the number of characters stored in the internal array
        //  and in this case it is 0.
        //  String representation of StringBuilder instance and in this case as there are no characters inside the StringBuilder object,
        //  therefore `sb.toString()` returns an empty String "",
    }
}
