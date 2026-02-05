package differenceMetFunc;

import java.util.function.Function;

public class MethodVsFunctionDemo {
    public static void main(String[] args) {
        CalculatorMethod calc = new CalculatorMethod();

        // Вызов метода
        int result1 = calc.square(5);
        System.out.println("Method result: " + result1); // 25

        // ФУНКЦИЯ через Functional Interface
        Function<Integer, Integer> squareFunc = n -> n * n;
        int result2 = squareFunc.apply(6);
        System.out.println("Function result: " + result2); // 36

        //  передать функцию как параметр
        applyFunction(10, squareFunc); // 100
    }

    // Метод, который принимает функцию как параметр
    static void applyFunction(int value, Function<Integer, Integer> func) {
        System.out.println("Applying function to " + value + ": " + func.apply(value));
    }
}