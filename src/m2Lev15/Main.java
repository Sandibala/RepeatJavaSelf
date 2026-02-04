package m2Lev15;

public class Main{
    public static void main(String[] args) {
        Outer outer = new Outer();
        OuterThread outerThread = new OuterThread();
        Thread t1 = new Thread(new InnerStatic.InnerClass("Task1"));
        Thread t2 = new Thread(new InnerStatic.InnerClass("Task2"));

        outer.method();
        outerThread.startThread();
        t1.start();
        t2.start();


    }
}
