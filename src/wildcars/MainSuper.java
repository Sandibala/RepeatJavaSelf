package wildcars;

import java.util.ArrayList;
import java.util.List;

import static wildcars.SuperExample.addIntegers;

public class MainSuper {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();

        addIntegers(numbers);


        System.out.println(numbers);

    }
}
