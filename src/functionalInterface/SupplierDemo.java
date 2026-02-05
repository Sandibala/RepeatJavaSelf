package functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println("Random number: " + randomNumber.get());
        System.out.println("Random number: " + randomNumber.get());
    }
}
//Что делает: ничего не принимает, возвращает объект.
//Можно думать: “Я что-то создаю/даю тебе”.
//Метод: get()