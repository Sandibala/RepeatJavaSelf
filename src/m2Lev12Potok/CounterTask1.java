package m2Lev12Potok;

public class CounterTask1 implements Runnable {
    private final Counter1 counter;
    public CounterTask1(Counter1 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment(); // synchronized метод
            Thread.yield();      // уступаем процессор
        }
    }
}

