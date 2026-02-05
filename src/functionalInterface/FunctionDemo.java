package functionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Hello"));
        System.out.println(stringLength.apply("Functional Interface"));
    }
}
//Function<T,R> = трансформация T → R
//Метод = apply(T)
//Лямбда = реализация трансформации