package lyambdaFuncInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lyambda {
    public static void main(String[] args) {
        int[] nums = {-1, 2 , 20, 33 ,44, 55, 66};
        long positiveNums = IntStream.of(nums)
                .filter(n -> n > 0)
                .filter(n -> n >50)
                .count();
        System.out.println("Positive Numbers" + " " +positiveNums);


        List<String> names = new ArrayList<>();
        names.add("Ann");
        names.add("Alya");
        names.add("Timur");
        names.add("Anuar");
        names.add("Adam");

        names.stream()
                .filter(x -> x.startsWith("A"))
                .forEach(x -> System.out.println(x));
        System.out.println();

        List<String> newNames = names.stream()
                .filter(x -> x.startsWith("A"))
                .filter(x -> x.length() >= 4)
                .sorted()
                .collect(Collectors.toList());

        newNames.stream()
                .forEach(x -> System.out.println(x));


    }
}
