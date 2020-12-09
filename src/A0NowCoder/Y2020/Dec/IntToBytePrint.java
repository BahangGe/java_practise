package A0NowCoder.Y2020.Dec;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 2020-12-8
 * Time: 16:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class IntToBytePrint {
        public static void main(String[] args) {
            int j = 167776589; // 00001010 00000000 00010001 01001101
            int n = 167776512; // 00001010 00000000 00010001 00000000
            //System.out.println((byte)(i & n)); // 167776512
            int a=j&n;
            for(int i=0;i<32;i++){

                int t=(a & 0x80000000>>>i)>>>(31-i);
                if (i % 8==0){
                    System.out.print(' ');
                }

                System.out.print(t);

            }
            System.out.println(a);
            System.out.println(Integer.toBinaryString(a));
            System.out.printf("d:%d   ",a);
            System.out.printf("o:%o   ",a);
            System.out.printf("b:%bin   ",a);
            System.out.printf("x:%x   ",a);
            int n1 = 70;
            if (n1 >= 60)
                System.out.println("及格了");
        }
}