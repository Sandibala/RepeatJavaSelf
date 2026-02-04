package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sadu", 79);
        map.put("Cat", 1);
        map.put("Paris",204);
        //Entry статик метод для того чтоб пробежаться по map
        for (Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        //LinkedHashMap -> чтоб вывкстии данные в том порядке в котором мы их вводили
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Sadu", 79);
        map1.put("Cat", 1);
        map1.put("Paris",204);

        for (Map.Entry<String , Integer> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // TreeMap<>(); -> гарантирует что данные отсортируются
        Map<String, Integer> map3 = new TreeMap<>();
        map3.put("Sadu", 79);
        map3.put("Cat", 1);
        map3.put("Paris",204);
        for (Map.Entry<String , Integer> entry : map3.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
