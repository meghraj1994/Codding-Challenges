package aaaaaaaaa;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q1ReturnsOnlyEvenNumberUsingJava8 {
    public static void main(String[] args) {

        //example1 :  returns only even
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(findOnlyEvenNumber(numbers));

        /* Example 2 :
         * From a list, find all pairs that sum to a given number (e.g., 10).

         *
         * */
        List<Integer> nums = List.of(1, 2, 3, 7, 5, 8, 6, 4);
        int target = 10;
        System.out.println(findPairsWhoseSumIsTarget(nums, target));

        //example 3 :  Find the first string that starts with letter "C"
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        String result = names.stream().filter(name -> name.startsWith("C")).findFirst().get();
        System.out.println(result);

        //example 4 :  : Find the sum of squares of numbers in a list.
        List<Integer> numbers1 = List.of(1, 2, 3, 4);

        Integer result1 = numbers1.stream()
                .map(i -> i * i)
                .reduce(0, Integer::sum);
        System.out.println(result1);

        Integer max = List.of(1, 2, 3, 4, 5).stream()
                .reduce((a, b) -> a > b ? a : b).get();
        System.out.println(max);

        //example5 : sort in reverse order
        List<String> fruits = List.of("apple", "banana", "cherry", "date");
        List<String> collect = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(collect);

       // example 6: Group words by their length.
        List<String> words = List.of("one", "two", "three", "four", "five");

        Map<Integer, List<String>> collect1 = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);

        // example 7 :Find the maximum number in a list.
                List<Integer> numbers2 = List.of(10, 20, 5, 80, 30);
        Integer integer = numbers2.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();
        System.out.println(integer);

        Integer integer1 = numbers2.stream()
                .max(Integer::compare)
                .get();
        System.out.println(integer1);


        //Count how many strings start with "A".
        List<String> namea = List.of("Alice", "Arnold", "Bob", "Charlie","Andrew");
        long a = namea.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println(a);


       // Given a list of integers, return a list of strings "even" or "odd" depending on whether the number is even or odd.
                List<Integer> numbersb = List.of(1, 2, 3, 4, 5);

        List<String> collect2 = numbersb.stream()
                .map(num -> num % 2 == 0 ? "even" : "odd")
                .collect(Collectors.toList());
        System.out.println(collect2);

        // Given a list of sentences, count the frequency of each word (case-insensitive).
        List<String> sentences = List.of("Java is fun", "Streams are powerful", "Java is powerful");



    }

    public static List<Integer> findOnlyEvenNumber(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> findPairsWhoseSumIsTarget(List<Integer> list, int target) {
        List<List<Integer>> collect = list.stream()
                .flatMap(i -> list.stream()
                        .filter(j -> i < j && i + j == target)
                        .map(j -> List.of(i, j)))
                .collect(Collectors.toList());

        return collect;

    }


}
