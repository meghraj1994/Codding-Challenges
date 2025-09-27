package aaaaaaaaa.FindTheLongestStringInAList;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* List<String> strings = Arrays.asList("apple", "bat", "elephant", "dog", "zebra");
 * output =elephant
 * */
public class FindTheLongestStringInAList {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "bat", "elephant", "dog", "zebra");

        String result = strings.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);

        System.out.println(result);

    }
}
