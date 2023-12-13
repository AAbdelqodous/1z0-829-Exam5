package q8;

public class Test {
    public static void main(String[] args) {
        Profitable obj = new Business(); //Line n2
        System.out.println(obj.profitPercentage); //Line n3
        //Even though correct syntax for accessing interface variable is by using Interface name, such as Profitable.
        // profitPercentage but reference variable also works.
        // As, obj is of Profitable type, hence obj.profitPercentage points to the 'profitPercentage' variable of Profitable type.
    }
}
