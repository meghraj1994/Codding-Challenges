package aaaa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompleteJava8Features {

    public static <chars> void main(String[] args) {

        //example1 :  returns only even
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //example2 : From a list, find all pairs that sum to a given number (e.g., 10)
        List<Integer> num1 = List.of(1, 2, 3, 7, 5, 8, 6, 4);
        int target = 10;
        num1.stream()
                .flatMap(i -> num1.stream()
                        .filter(j -> i > j && i + j == target).map(j -> List.of(i, j))).collect(Collectors.toList())
                .forEach(System.out::println);


        //example 3 :  Find the first string that starts with letter "C"
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        names.stream().filter(name -> name.startsWith("C")).collect(Collectors.toList())
                .forEach(System.out::println);


        //example 4 :  : Find the sum of squares of numbers in a list.
        List<Integer> numbers1 = List.of(1, 2, 3, 4);
        System.out.println(numbers1.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum));

        //example5 : sort in reverse order
        List<String> fruits = List.of("apple", "banana", "cherry", "date");
        fruits.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // example 6: Group words by their length.
        List<String> words = List.of("one", "two", "three", "four", "five");
        System.out.println(words.stream()
                .collect(Collectors.groupingBy(String::length)));

        // example 7 :Find the maximum number in a list.
        List<Integer> numbers2 = List.of(10, 20, 5, 80, 30);
        Integer x = numbers2.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(x);
        System.out.println(numbers2.stream()
                .max(Integer::compareTo)
                .get());

        // example 8 :Find the maximum number in a list.
        System.out.println(numbers2.stream()
                .min(Integer::compareTo).get());


        // example 9 : Count how many strings start with "A".
        List<String> students = List.of("Alice", "Arnold", "Bob", "Charlie", "Andrew");
        System.out.println(students.stream()
                .filter(name -> name.startsWith("A"))
                .count());

        //example 10 :return a list of strings "even" or "odd" depending on whether the number is even or odd.
        List<Integer> digits = List.of(1, 2, 3, 4, 5);

        List<String> collect = digits.stream()
                .map(digit -> digit % 2 == 0 ? "even" : "odd").collect(Collectors.toList());
        System.out.println(collect);


        // Given a list of sentences, count the frequency of each word (case-insensitive).
        List<String> sentences = List.of("Java is fun", "Streams are powerful", "Java is powerful");

        sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + " -> " + count));


        //case 4 :  find first non repeated char of given String
        String s = "TroubleShooter";
        // output = 1

        Character character = s.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(character);


        String arr[] = {"abcd", "dcba", "epam", "pame", "aepm"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(word);
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> val : map.values()) {
            result.add(val);
        }



    }
}
