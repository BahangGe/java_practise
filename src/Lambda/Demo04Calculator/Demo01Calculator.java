package Lambda.Demo04Calculator;

import java.security.PublicKey;

public class Demo01Calculator {
    public static void main(String[] args) {
        //1
        invokeCalc(1,2,(a,b)-> a + b);

        //2
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //3
        invokeCalc(11,21,(int a,int b)->{return a+b;});
    }
    public static void invokeCalc(int a,int b,Calculator c){
        int sum=c.calc(a,b);
        System.out.println(sum);
    }
}
