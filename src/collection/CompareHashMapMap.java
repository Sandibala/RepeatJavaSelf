package collection;

import java.util.HashMap;
import java.util.Map;

public class CompareHashMapMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ako", 2);
        map.put("Asel", 1);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Bake", 6);
        hashMap.put("Nuka", 5);
        hashMap.clone();


        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println(hashMap.clone());
        }
    }
}
