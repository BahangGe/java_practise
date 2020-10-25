package Lambda.Demo01.Lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"2");
            }
        }).start();
        //lambda
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"3")).start();
    }
}
