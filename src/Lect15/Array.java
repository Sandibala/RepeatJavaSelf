package Lect15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Aliыe"); // не добавится, так как уже есть

        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Set
        Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(-2);
        numbers.add(-7);
        numbers.add(14);
        numbers.add(4);
        System.out.println(numbers);

        Set<Integer> copyNumbers = new HashSet<>(numbers);
        for (Integer number : copyNumbers) {
            if (number < 0) {
                numbers.remove(number);
            }
        }
        System.out.println(numbers);
    }

}

