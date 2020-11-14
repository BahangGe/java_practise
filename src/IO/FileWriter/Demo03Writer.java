package IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("w2.txt");
        char[] cs = {'a','b','c'};
        fw.write(cs,1,2);
        fw.flush();
        fw.write("我i学习java",3,5);
        fw.close();
    }
}
