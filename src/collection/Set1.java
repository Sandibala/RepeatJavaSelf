package collection;

import java.util.*;

// Уникальность его отличие
// Не всегда сортирует
public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);

        for (int x : set){
            System.out.print(x + " ");
        }
        System.out.println();


        //LinkedHashSet<>(); -> выведет данные в том порядке в котором мы их добавили ничего не меняет просто не оставляет дубликатов
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(5);
        set2.add(3);
        set2.add(2);
        set2.add(1);
        set2.add(3);

        for (int x : set2){
            System.out.print(x + " ");
        }

        System.out.println();
        // Гарантия того что наши данные будут отсортированы в таком порядке в каком мы хотим
        Set<Integer> set3 = new TreeSet<>();
        set3.add(5);
        set3.add(3);
        set3.add(2);
        set3.add(1);
        set3.add(3);

        for (int x : set3){
            System.out.print(x + " ");
        }

        System.out.println();
        //В порядке убывания
        Set<Integer> set4 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        set4.add(5);
        set4.add(3);
        set4.add(2);
        set4.add(1);
        set4.add(3);

        for (int x : set4){
            System.out.print(x + " ");
        }
    }
}
