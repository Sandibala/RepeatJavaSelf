package m2Lev15;

public class OuterThread {
    private int count = 0;

    class InnerTask implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                count++;
                System.out.println(Thread.currentThread().getName() + " count = " + count);
            }
        }
    }
    void startThread(){
        Thread t = new Thread(new InnerTask());
        t.start();
    }
}
