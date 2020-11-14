package A0NowCoder.Y2020.Nov;

import java.util.Scanner;

public class Zijie2019_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        //String line2 = sc.next();
//        System.out.println(line);
        System.out.println("1111");
        sc.nextLine();
//        System.out.println(a+"222");
//        String line="hellllloooo";
//        System.out.println(line.replaceAll("(.)\\1+","$1$1").replaceAll("(.)\\1(.)\\2","$1$1$2"));
        for (int i = 0; i < line; i++) {
//            System.out.println(line);
            System.out.println(sc.nextLine().replaceAll("(.)\\1+","$1$1").replaceAll("(.)\\1(.)\\2","$1$1$2"));
        }
//        System.out.println(sc.nextLine().replaceAll("(.)\\1+","$1$1").replaceAll("(.)\\1(.)\\2","$1$1$2"));

    }
}
