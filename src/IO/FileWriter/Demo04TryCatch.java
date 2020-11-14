package IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
/*
JDK1.7 以前用以下方法
 */
public class Demo04TryCatch {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("N:\\w2.txt");
            char[] cs = {'a','b','c'};
            fw.write(cs,1,2);
            fw.flush();
            fw.write("我i学习java",3,6);
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
          }
        }
    }
}
