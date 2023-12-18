package q28;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        try(var reader = new InputStreamReader(
                new FileInputStream("C:\\Users\\abdelqodous\\Documents\\java_work\\message.txt"))){
            while (reader.ready()){
                reader.skip(1); //  inherited from Reader class and skips the passed n characters.
                reader.skip(1);
                System.out.print((char) reader.read());
            }
        }
    }
}
