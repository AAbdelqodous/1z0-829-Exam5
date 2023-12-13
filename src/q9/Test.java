package q9;

public class Test {
    public static void main(String[] args) {
        String [][] countries = {{"SINGAPORE", "AUSTRALIA"}, {"CHINA", "RUSSIA"}};
//        for (int i = 1; i <= countries.length ; i++) {  //RUSSIA Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//            for (int j = 1; j <= countries[i].length; j++) { //Index 2 out of bounds for length 2
        for (int i = 0; i <= countries.length ; i++) {
            for (int j = 0; j <= countries[i].length; j++) {
                System.out.print(countries[i][j] +" ");
            }
        }
    }
}
