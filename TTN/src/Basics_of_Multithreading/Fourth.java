package Basics_of_Multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fourth {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> fu = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt(10000);
                System.out.println("Started");
                Thread.sleep(duration);
                System.out.println("Finished");
                return duration;
            }
        });
        try {
            System.out.println(fu.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi everyone");
            }
        });
        executor.shutdown();
    }
}