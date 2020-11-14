package IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter wr=new FileWriter("w.txt");
        wr.write(97);
        wr.flush();
        wr.write(98);
        wr.close();
        wr.write(99);

    }
}
