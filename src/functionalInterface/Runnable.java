package functionalInterface;

public class Runnable {
    public static void main(String[] args) {
        java.lang.Runnable r = () -> System.out.println("I am running");
        r.run();
    }
}
//Runnable = поведение без параметров и без возвращаемого значения
//Используется для потоков и задач
//Лямбда реализует метод run()