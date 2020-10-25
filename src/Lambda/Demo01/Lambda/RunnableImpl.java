package Lambda.Demo01.Lambda;

import java.util.TreeMap;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"123");
    }
}
