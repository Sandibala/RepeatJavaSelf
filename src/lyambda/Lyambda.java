package lyambda;

import java.util.*;

public class Lyambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bbb", "cc");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println(list);

        List<String> list1 = Arrays.asList("ddd", "c", "ff");
        Collections.sort(list1, (s1, s2) -> s1.length() - s2.length());
        list1.forEach(System.out::println);
    }
}
