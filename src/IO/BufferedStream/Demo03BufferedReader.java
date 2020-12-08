package IO.BufferedStream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo03BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("BufferedReader.txt"));
        //传统read
        /*int len=0;
        char[] cs=new char[1024];
        while ((len=br.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
        br.close();*/
        //readLine
        String line;
        while ((line=br.readLine())!=null)
        {
            System.out.println(line);
        };
      br.close();
    }
}
