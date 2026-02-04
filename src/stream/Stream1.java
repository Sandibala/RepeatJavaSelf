package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie");
        list.stream()
                .filter(s -> s.length() > 3)
                .map(String :: toUpperCase)
                .forEach(System.out::println);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum = nums.stream() // создаём поток
                .filter(n -> n % 2 == 0) //условие
                .map(n -> n * n) //возводит в квадрат
                .reduce(0, Integer:: sum);  //терминальный
        System.out.println(sum);

        //6️⃣ Фильтрация и преобразование данных  ❤️❤️❤️❤️
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> filtered = names.stream()
                .filter(s -> s.length() > 3)//условие
                .map(String::toLowerCase) //преобразование
                .collect(Collectors.toList());
        System.out.println(filtered);

        //7️⃣ Проверка элементов
        boolean allLong = names.stream()
                .allMatch(s -> s.length() > 2);
        System.out.println(allLong);
        boolean anyBob = names.stream()
                .anyMatch(s -> s.equals("Bob"));
        System.out.println(anyBob);

//8️⃣ Служебный класс Optional
//Optional<T> — контейнер, который может содержать или не содержать значение
//Используется, чтобы избежать NullPointerException
        Optional<String> opt = names.stream()
                .filter(s -> s.startsWith("D"))
                .findFirst();
        System.out.println(opt.orElse("Not Found"));

        List<String> result = names.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        Set<String> set = names.stream()
                .collect(Collectors.toSet());

        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joined); // Alice, Bob, Charlie
    }
}

