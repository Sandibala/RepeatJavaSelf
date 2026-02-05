package functionalInterface;

import java.util.function.Consumer;
public class ConsumerDemo {
    public static void main(String[] args) {
            Consumer<String> greet = name -> System.out.println("Welcome, " + name + "!");
            greet.accept("Alice");
            greet.accept("Bob");
        }
}
//Consumer<T> = “потребитель” объекта T
//Метод = accept(T)
//Лямбда реализует действие для каждого объекта
//Что делает: берёт объект и что-то с ним делает, ничего не возвращает.
//Можно думать: “Мне дают объект, я с ним что-то делаю”.
//Метод: accept(T obj)