package wildcars;

import java.util.List;

import static wildcars.ExtendsExample.printNumbers;

public class MainExtends {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5);
        printNumbers(integers);
        printNumbers(doubles);
    }
}
