package wildcars;

import java.util.List;

public class SuperExample {
    public static void addIntegers(List<? super Number> list ){
        list.add(10);
        list.add(20);
        list.add(1.2);
    }
}
//Можно класть, но читаешь как Object
