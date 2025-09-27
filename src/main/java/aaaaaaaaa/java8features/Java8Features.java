package aaaaaaaaa.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Features {

    public static void main(String[] args) {
        //case 1 : Given a list of integers, find the sum of all elements.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream().
                mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum is "+sum);

        System.out.println(numbers.stream()
                .reduce(Integer::sum).get());


        //case 2 : Given a list of integers, find the maximum and minimum numbers.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

        int maxNum = numbers1.stream().max(Integer::compareTo).get();
        int minNum = numbers1.stream().min(Integer::compareTo).get();
        System.out.println("max num is : "+maxNum);
        System.out.println("min num is : "+minNum);


        //case 3 : Given a list of integers, filter out only the even numbers.
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numbers3.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)));

        System.out.println(numbers3.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd")));

    }

}
