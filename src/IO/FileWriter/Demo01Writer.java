package IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter wr=new FileWriter("w.txt");
        wr.write(97);
        //wr.flush();
        wr.close();

    }
}
