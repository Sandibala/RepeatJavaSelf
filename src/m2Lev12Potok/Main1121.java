package m2Lev12Potok;

public class Main1121 {
    public static void main(String[] args) throws InterruptedException {

        // -----------------------------
        // 1️⃣ synchronized + yield + join
        // -----------------------------
        Counter1 counter = new Counter1();
        Thread t1 = new Thread(new CounterTask1(counter), "CounterThread1");
        Thread t2 = new Thread(new CounterTask1(counter), "CounterThread2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Счётчик после потоков: " + counter.count);

        // -----------------------------
        // 2️⃣ volatile пример
        // -----------------------------
        VolatileTask1 volatileTask = new VolatileTask1();
        Thread t3 = new Thread(volatileTask, "VolatileThread1");
        t3.start();

        Thread.sleep(1000);
        volatileTask.stop(); // изменяем флаг
        t3.join();

        // -----------------------------
        // 3️⃣ DeadLock пример
        // -----------------------------
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread dead1 = new Thread(new DeadLockTask11(lock1, lock2), "Dead1");
        Thread dead2 = new Thread(new DeadLockTask21(lock1, lock2), "Dead2");

        dead1.start();
        dead2.start();

        // ⚠ Потоки могут зависнуть из-за DeadLock
        // System.out.println("DeadLock запущен (потоки могут виснуть!)");
    }
}
