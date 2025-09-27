package java8features.streamapi.inbuiltfunctionalinterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainClass{

    public static void main(String[] args) {

        Function<String,Integer> function = (s) -> s.length();

        System.out.println(function.apply("Meghraj"));

        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> (a+b);
        System.out.println(biFunction.apply(2, 3));

        Consumer<String> consumer = (a) -> System.out.println(a);
        consumer.accept("Meghraj");


    }



}
