package aaaaaaaaa.GroupStringsByTheirLength;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* Group a list of strings based on their length.
*List<String> strings = Arrays.asList("apple", "bat", "cat", "dog", "elephant");
 *{3=[bat, cat, dog], 5=[apple], 8=[elephant]}
 * */
public class GroupByLength {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "bat", "cat", "dog", "elephant","dog");

        System.out.println(strings.stream()
                .collect(Collectors.groupingBy(String::length)));

        System.out.println(strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    }
}
