package collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class MethodRemoveArrayLinked {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 20000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        arrayList.remove(0);
        long end = System.currentTimeMillis();
        System.out.println("Time taken to remove element in ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        linkedList .remove(0);
        end = System.currentTimeMillis();
        System.out.println("Time taken to remove element in LinkedList: " + (end - start));
    }
}
