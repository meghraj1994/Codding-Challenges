package aaaaaaaaa.FindSecondHighestNumberInAList;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Given a list of integers, find the second-highest number.
 *List<Integer> numbers = Arrays.asList(4, 7, 2, 9, 5, 1); output = 7
 *
 * */
public class FindSecondHighestNumberList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 7, 2, 9, 5, 1);

        Integer result = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
