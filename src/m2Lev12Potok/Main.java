package m2Lev12Potok;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Начало");
//        Thread thread = new Thread(new MyTask());
//        thread.start();
//        Thread.sleep(2000);
//        System.out.println("Прошло 2 секунды");
//        Thread thread1 = new Thread(new MyThread());
//        thread1.start();

        Thread thread2 = new Thread(new Interrupt());
        thread2.start();
        Thread.sleep(6000);
        thread2.interrupt();
    }
}
