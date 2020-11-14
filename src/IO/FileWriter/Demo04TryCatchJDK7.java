package IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
JDK1.7 以后 用以下方法
 */
public class Demo04TryCatchJDK7 {
    public static void main(String[] args) {
        try (FileWriter fw  =new FileWriter("N:\\w2.txt");){
            char[] cs = {'a','b','c'};
            fw.write(cs,1,2);
            fw.flush();
            fw.write("我i学习java",3,5);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
