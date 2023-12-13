package q4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Derived extends Base{
    @Override
    public void print() throws IOException {
        throw new FileNotFoundException();
    }
}
