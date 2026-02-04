package m2Lev12Potok;

public class VolatileTask1 implements Runnable {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ждёт flag...");
        while (running) {
            // ждем, ничего не делаем
        }
        System.out.println(Thread.currentThread().getName() + " заметил, что flag = false");
    }
}
