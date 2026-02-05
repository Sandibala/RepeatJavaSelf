package wildcars;

import java.util.List;

public class SuperExample {
    public static void addIntegers(List<? super Integer> list ){
        list.add(10);
        list.add(20);

    }
}
//Можно класть, но читаешь как Object
