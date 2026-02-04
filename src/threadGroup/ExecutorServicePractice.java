package threadGroup;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServicePractice {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task1 = () -> "Task 1 done";
        Callable<String> task2 = () -> "Task 2 done";
        Callable<String> task3 = () -> "Task 3 done";

        Future<String> f1 = executor.submit(task1);
        Future<String> f2 = executor.submit(task2);
        Future<String> f3 = executor.submit(task3);


        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        executor.shutdown();
    }
}
