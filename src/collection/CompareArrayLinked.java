package collection;
/**
Time Complexity for 2 collections is difference
 **/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CompareArrayLinked {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000;  i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++)
            arrayList.get(i);
            long end = System.currentTimeMillis();
            System.out.println("Time  for ArrayList " + (end - start));

         start = System.currentTimeMillis();
        //        for (int i = 0; i < linkedList.size(); i++)
//            linkedList.get(i);
//         Iterator<Integer> iterator = linkedList.iterator();
//         while (iterator.hasNext())
//             iterator.next();
        for (int x : linkedList)
        end = System.currentTimeMillis();
        System.out.println("Time for LinkedList " + (end - start));


    }
}
