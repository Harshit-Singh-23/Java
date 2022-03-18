package Basics_of_Multithreading;

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        ReentractLocks obj=new ReentractLocks();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.firstThread();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.secondThread();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        obj.disp();
    }
}