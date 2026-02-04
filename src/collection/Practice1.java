package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        for (int i = 0; i < integers.size(); i++ ){
            System.out.println(integers.get(i) + " ");
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(4);

        for (int j = 0; j < linkedList.size(); j++ ){
            System.out.println(linkedList.get(j) + " ");
        }

    }
}
