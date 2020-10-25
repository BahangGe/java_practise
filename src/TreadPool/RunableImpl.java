package TreadPool;

import java.util.TreeMap;

public class RunableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程");
    }
}
