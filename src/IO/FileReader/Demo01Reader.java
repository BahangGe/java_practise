package IO.FileReader;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.sound.midi.Soundbank;
import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        long s=System.currentTimeMillis();
        FileReader fr=new FileReader("c.txt");
        //读取单个字符
        /*int len=0;
        while ((len=fr.read())!=-1){
            System.out.println((char)len);
        }*/
        //读取多个
        char[] cs=new char[1024];
        int len=0;
        while ((len=fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
        fr.close();
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }
}
