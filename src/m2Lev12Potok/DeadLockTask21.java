package m2Lev12Potok;

public class DeadLockTask21 implements Runnable {
    private final Object lock1;
    private final Object lock2;

    public DeadLockTask21(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " захватил lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " захватил lock1");
            }
        }
    }
}

