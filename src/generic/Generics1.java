package generic;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
    public static void main(String[] args) {
        //Без generics (плохо)
        List list = new ArrayList();
        list.add("Java");
        list.add(10);
        String s = (String) list.get(1);

//        //С generics (нормально)
//        List<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add(10); //



    }
}
