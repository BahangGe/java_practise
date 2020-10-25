package Lambda.Demo02.Lambda;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("1111");
            }
        });
        //lambda
        invokeCook(()->{
            System.out.println("222");
        });
    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
