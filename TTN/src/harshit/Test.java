package harshit;

class ThreadClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Here");
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Here in thread2");
    }
}



public class Test {
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.run();

        System.out.println();

        Thread2 thread2 = new Thread2();
        thread2.run();

        new thread3(() -> s );
    }
    
}
