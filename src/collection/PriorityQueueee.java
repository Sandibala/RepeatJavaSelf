package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
//Зачем он нужен? Сортирует в порядке возрастания
//Зачем он нужен? Может Сортировать в порядке убывания с Comparator

public class PriorityQueueee {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(1);

        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}
