package m2Lev12Potok;

public class MainSwap {
    public static void main(String[] args) {
        Swap swapObj = new Swap();

        Thread t1 = new Thread(swapObj);
        Thread t2 = new Thread(swapObj);

        Thread t3 = new Thread(swapObj);
        Thread t4 = new Thread(swapObj);

        t1.start();
        t2.start();

        t3.start();
        t4.start();
    }
}
