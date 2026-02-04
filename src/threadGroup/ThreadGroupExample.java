package threadGroup;

public class  ThreadGroupExample {
    public static void main(String[] args){
        ThreadGroup threadGroup = new ThreadGroup("MyGroup");

        Thread t1 = new Thread(threadGroup, () -> {
            System.out.println(Thread.currentThread().getName() + " started");
        }, "Thread-1");
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread priority: " + t1.getPriority());
        t1.start();

        Thread t2 = new Thread(threadGroup, () -> {
            System.out.println(Thread.currentThread().getName() + " started");
        }, "Thread-2");



        t2.start();

        System.out.println("Active threads in group: " + threadGroup.activeCount());
    }
}
