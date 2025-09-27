package java8complete.functionalinterface;


import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;

class FunctionDemo implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}


class ConsumerDemo implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}


class Supplier implements java.util.function.Supplier<String> {

    @Override
    public String get() {
        return "Meghraj......";
    }
}


public class PredefinedFunctionalInterface {


    public static void main(String[] args) {

        Function<String, Integer> function = name -> name.length();
        System.out.println(function.apply("Meghraj"));

        Consumer<String> consumer = (name) -> System.out.println(name);
        consumer.accept("Meghraj");


        java.util.function.Supplier<LocalDate> supplier = () -> LocalDate.now();
        System.out.println(supplier.get());
    }

}
