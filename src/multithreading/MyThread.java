package multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child THread");
            Thread.yield();
        }
    }
}

class MyThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        MyThread t = new MyThread();
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}