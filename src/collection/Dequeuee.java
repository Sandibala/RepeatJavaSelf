package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Dequeuee {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque1 = new LinkedList<>();
        deque.add(2);
        deque.add(4);
        deque.add(1);
        deque.add(3);

        deque1.add(3);
        deque1.add(2);
        deque1.add(4);
        deque1.add(5);
        deque1.add(1);

        while (!deque.isEmpty()){
            System.out.print((deque.poll()) + " ");
        }
        System.out.println();

        while (!deque1.isEmpty()){
            System.out.print((deque1.poll()) + " ");
        }
    }
}
