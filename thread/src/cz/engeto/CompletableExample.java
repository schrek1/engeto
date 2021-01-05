package cz.engeto;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompletableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Run a task specified by a Runnable Object asynchronously.
        CompletableFuture<Void> first = CompletableFuture.runAsync(() -> {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(Thread.currentThread() + ":" + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Vlakno potomka (druhe vlakno) preruseno.");
            }

        });

        CompletableFuture<Void> second = CompletableFuture.runAsync(() -> {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(Thread.currentThread() + ":" + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Vlakno potomka (druhe vlakno) preruseno.");
            }

        });

        CompletableFuture.allOf(first, second);

        System.out.println("Finished");


    }
}
