package threadGroup;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FullThreadPractice {
    public static void main(String[] args) throws Exception {
        // 1️⃣ Создаём группу потоков
        ThreadGroup group = new ThreadGroup("WorkerGroup");
        System.out.println("Created thread group: " + group.getName());

        // 2️⃣ Создаём пул потоков с 3 потоками
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 3️⃣ Создаём задачи Callable (они возвращают результаты)
        Callable<String> task1 = () -> {
            Thread.currentThread().setName("Worker-High"); // Меняем имя текущего потока
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // Высокий приоритет
            return "Task 1 completed by " + Thread.currentThread().getName();
        };

        Callable<String> task2 = () -> {
            Thread.currentThread().setName("Worker-Medium");
            Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // Средний приоритет
            return "Task 2 completed by " + Thread.currentThread().getName();
        };

        Callable<String> task3 = () -> {
            Thread.currentThread().setName("Worker-Low");
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // Низкий приоритет
            return "Task 3 completed by " + Thread.currentThread().getName();
        };

        // 4️⃣ Отправляем задачи в пул потоков
        Future<String> result1 = executor.submit(task1);
        Future<String> result2 = executor.submit(task2);
        Future<String> result3 = executor.submit(task3);

        // 5️⃣ Выводим результаты выполнения задач
        System.out.println(result1.get()); // блокирует, пока задача не выполнится
        System.out.println(result2.get());
        System.out.println(result3.get());

        // 6️⃣ Печатаем количество активных потоков в группе
        System.out.println("Active threads in group: " + group.activeCount());

        // 7️⃣ Завершаем пул потоков
        executor.shutdown();
    }
}
