package java8features.lamba.inbuiltfunctionalinterface.function;

import java.util.function.Function;

public class Runner {

    public static void main(String[] args) {
        //using traditional OOP way
//        FunctionImpl function = new FunctionImpl();
//        System.out.println(function.apply("Meghraj"));


        // using lambda expression

        Function<String, Integer> function = (t) -> (t.length());
        System.out.println(function.apply("Meghraj"));


    }

}
