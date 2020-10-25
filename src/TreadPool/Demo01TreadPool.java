package TreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01TreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        //es.shutdown();
    }
}
