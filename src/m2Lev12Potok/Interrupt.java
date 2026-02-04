package m2Lev12Potok;

public class Interrupt implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("I am working!");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println("Поток прервали во сне");
                break; // выходим из цикла
            }
        }
        System.out.println("Поток завершён");
    }
}