package IO.BufferedStream;

import java.io.*;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
//        show01();//buffered 多个字节 133 ****************
//        show02();//带size的buffered 单个字节 2502
//        show03();//buffered 单个字节2549
//           show04();//带size的buffered 多个字节 447
//        show05();//不要buffered 单个字节
        show06();//不要buffered 多个字节  485

    }

    private static void show06() throws IOException {
        long s =  System.currentTimeMillis();
        FileInputStream bis = new FileInputStream("c:\\1.rar");
        FileOutputStream bos = new FileOutputStream("d:\\1.rar");
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }

    private static void show05() throws IOException {
        long s =  System.currentTimeMillis();
        FileInputStream bis = new FileInputStream("c:\\1.rar");
        FileOutputStream bos = new FileOutputStream("d:\\1.rar");
        int len=0;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }

    private static void show03() throws IOException {
        long s =  System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\1.rar"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\1.rar"));
        int len=0;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }

    private static void show02() throws IOException {
        long s =  System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\1.rar"),10240);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\1.rar"),10240);
        int len=0;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
        long e=System.currentTimeMillis();
        System.out.println(e-s);

    }

    private static void show01() throws IOException {
        long s =  System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\1.rar"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\1.rar"));
        int len=0;
        byte[] bytes= new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        long e=System.currentTimeMillis();
        System.out.println(e-s);

    }
    private static void show04() throws IOException {
        long s =  System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\1.rar"),1240);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\1.rar"),10240);
        int len=0;
        byte[] bytes= new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        long e=System.currentTimeMillis();
        System.out.println(e-s);

    }
}
