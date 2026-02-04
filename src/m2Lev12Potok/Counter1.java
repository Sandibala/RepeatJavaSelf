package m2Lev12Potok;

public class Counter1 {
        int count = 0;

        synchronized void increment() {
            count++;
            System.out.println(Thread.currentThread().getName() + " увеличил счётчик: " + count);
        }
    }

