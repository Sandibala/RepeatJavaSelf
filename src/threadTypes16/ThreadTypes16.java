package threadTypes16;

import java.util.concurrent.*;

public class ThreadTypes16 {

    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Обычный Thread
        Thread simpleThread = new Thread(() ->
                System.out.println("Hello from Thread: " + Thread.currentThread().getName())
        );
        simpleThread.start();

        // 2️⃣ FixedThreadPool (3 потока)
        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 6; i++) {
            int taskId = i;
            fixedPool.submit(() ->
                    System.out.println("FixedThreadPool Task " + taskId +
                            " executed by " + Thread.currentThread().getName())
            );
        }
        fixedPool.shutdown();

        // 3️⃣ CachedThreadPool
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            cachedPool.submit(() ->
                    System.out.println("CachedThreadPool executed by " +
                            Thread.currentThread().getName())
            );
        }
        cachedPool.shutdown();

        // 4️⃣ SingleThreadExecutor
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            int taskId = i;
            singleExecutor.submit(() ->
                    System.out.println("SingleThreadExecutor Task " + taskId +
                            " executed by " + Thread.currentThread().getName())
            );
        }
        singleExecutor.shutdown();

        // 5️⃣ ScheduledExecutorService
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // задержка 2 секунды
        scheduler.schedule(() ->
                        System.out.println("Delayed Task executed by " +
                                Thread.currentThread().getName()),
                2, TimeUnit.SECONDS
        );

        // периодическая задача каждую секунду
        scheduler.scheduleAtFixedRate(() ->
                        System.out.println("Periodic Task executed by " +
                                Thread.currentThread().getName()),
                0, 1, TimeUnit.SECONDS
        );

        // остановка через 5 секунд
        scheduler.schedule(scheduler::shutdown, 5, TimeUnit.SECONDS);

        // 6️⃣ WorkStealingPool (ForkJoinPool)
        ExecutorService stealingPool = Executors.newWorkStealingPool();
        for (int i = 0; i < 6; i++) {
            int taskId = i;
            stealingPool.submit(() ->
                    System.out.println("WorkStealingPool Task " + taskId +
                            " executed by " + Thread.currentThread().getName())
            );
        }
        Thread.sleep(2000);
        stealingPool.shutdown();

        // 7️⃣ ThreadFactory
        ThreadFactory factory = r -> {
            Thread t = new Thread(r);
            t.setName("CustomThread-" + t.getId());
            return t;
        };

        ExecutorService customPool = Executors.newFixedThreadPool(2, factory);
        customPool.submit(() ->
                System.out.println("Task executed by " +
                        Thread.currentThread().getName())
        );
        customPool.shutdown();

        // 8️⃣ ThreadLocal
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        Runnable threadLocalTask = () -> {
            threadLocal.set((int) (Math.random() * 100));
            System.out.println(
                    "Thread " + Thread.currentThread().getName() +
                            " has value: " + threadLocal.get()
            );
        };

        Thread t1 = new Thread(threadLocalTask);
        Thread t2 = new Thread(threadLocalTask);
        t1.start();
        t2.start();

        // 9️⃣ ThreadLocalRandom
        Runnable randomTask = () -> {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println(
                    "Thread " + Thread.currentThread().getName() +
                            " generated: " + randomNum
            );
        };

        Thread t3 = new Thread(randomTask);
        Thread t4 = new Thread(randomTask);
        t3.start();
        t4.start();
    }
}
