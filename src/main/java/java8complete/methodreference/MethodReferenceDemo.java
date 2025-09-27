package java8complete.methodreference;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


class MyReferenceDemo {


    public static Integer addition(Integer name) {
        return name;
    }

    public Integer add(Integer a) {
        return a + 3;
    }
}

public class MethodReferenceDemo {

    public static void main(String[] args) {

//        Function<Integer, Double> square = Math::sqrt;
//        System.out.println(square.apply(3));

        Function<Integer, Integer> function = MyReferenceDemo::addition;
        System.out.println(function.apply(3));

        MyReferenceDemo myReferenceDemo = new MyReferenceDemo();

//        Function<Integer,Integer> m = (a) -> myReferenceDemo.add(a);
        Function<Integer, Integer> m = myReferenceDemo::add;
        System.out.println(m.apply(2));


        Function<String, String> function1 = String::toLowerCase;


        String email = null;

        Optional<String> em = Optional.ofNullable(email);
        System.out.println(em.orElse("mkurmi"));


        String result = " abc ";

        Optional.of(result)
                .filter(r -> r.contains("abc"))
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res));


        int[] nums = {1,2,3,4,5,6};
        Arrays.stream(nums).forEach(System.out::println);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Set<Integer> sets = new HashSet<>(list);
        sets.stream().forEach(System.out::println);



        List<String> fruits = Arrays.asList("Mango", "Banana", "Apple", "Orange");


        //1) sorting using comparator method
        fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-----------------------------------");

        //2) sorting using lamda expression
        fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("-----------------------------------");
        //3)sorting using sorted()

        fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

    }
}
