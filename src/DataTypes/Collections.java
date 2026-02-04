package DataTypes;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> numb = new HashSet<>();
        numb.add(234);
        numb.add(234);
//        System.out.println(numb);

        Map<String, Integer> mean = new HashMap<>();
        mean.put("hi",123);
        mean.put("hi",345);
        System.out.println(mean.get("hi"));

//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Tesla");
//        for (int i = 0; i < 5; i++) {
//            String st = in.nextLine();
//            cars.add(st);
//            System.out.println(st);
//        }
    }
}
