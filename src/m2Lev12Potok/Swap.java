package m2Lev12Potok;

public class Swap implements Runnable {
    private String name1 = "Оля";
    private String name2 = "Лена";

    @Override
    public void run() {
        swap();
        System.out.println("После swap: " + name1 + " - " + name2);
    }

    public void swap() {
        // Убираем synchronized — теперь блокировки нет
        String s = name1;
        // небольшая задержка, чтобы усилить гонку потоков
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }
        name1 = name2;
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }
        name2 = s;
    }

    public void swapS() {
        synchronized (this) { // блок synchronized
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }
}
