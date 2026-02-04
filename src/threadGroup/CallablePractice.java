package threadGroup;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallablePractice {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) sum += i;
            return sum;
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> result = executor.submit(task);

        System.out.println("Sum is: " + result.get());
        executor.shutdown();
    }
}
