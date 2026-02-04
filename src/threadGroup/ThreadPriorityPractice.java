package threadGroup;

public class ThreadPriorityPractice {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> System.out.println("High priority thread"), "HighThread");
        Thread thread2 = new Thread(() -> System.out.println("Low priority thread"), "LowThread");

        thread2.setPriority(Thread.MAX_PRIORITY); // 10
        thread1.setPriority(Thread.MIN_PRIORITY);  // 1

        System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " priority: " + thread2.getPriority());

        thread1.start();
        thread2.start();
}
}