package Lambda.Demo01.Lambda;

import TreadPool.RunableImpl;

public class Demo01Runnable {
    public static void main(String[] args) {
        RunableImpl run =new RunableImpl();
        Thread t=new Thread(run);
        t.start();

        //简化  匿名内部内
        Runnable r= new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"2222");
            }
        };
        new Thread(r).start();

        //
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"3");
            }
        }).start();

    }
}
