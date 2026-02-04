package m2Lev12Potok;

public class MainCFW {
    public static void main(String[] args) {
        Thread counter = new Thread(new CounterTask());
        Thread waiting = new Thread(new WaitingTask());
        Thread writer  = new Thread(new FileWriteTask());

        counter.start();
        waiting.start();
        writer.start();
    }
}
