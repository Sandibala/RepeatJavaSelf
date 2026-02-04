package m2Lev12Potok;

public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток работает: " + Thread.currentThread().getName());
    }
}
