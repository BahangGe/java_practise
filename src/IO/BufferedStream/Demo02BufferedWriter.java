package IO.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("demoBufferedWriter.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("字符缓冲流");
            bw.newLine();
        }
        bw.close();

    }
}
