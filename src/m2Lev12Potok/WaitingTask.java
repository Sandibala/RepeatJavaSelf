package m2Lev12Potok;

public class WaitingTask implements Runnable{
        @Override
        public void run() {
            System.out.println("Жду данные...");
            try {
                Thread.sleep(3000);
                System.out.println("Данные получены!");
            } catch (InterruptedException e) {
                return;
            }
        }
    }
