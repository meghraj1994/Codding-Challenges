package java8features.methodreference;


import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Demo {
    void display(String s);
}
public class MethodReferenceToAnInstanceMethodOfAParticularObject {
    public void print(String s) {
        s = s.toUpperCase();
        System.out.println(s);
    }
    public static void main(String[] args) {
        MethodReferenceToAnInstanceMethodOfAParticularObject obj = new MethodReferenceToAnInstanceMethodOfAParticularObject();

        Demo demo = s -> obj.print(s);
        demo.display("meghraj");

        Demo demo1 = obj ::print;
        demo1.display("sukanya");

        Function<String, Integer> function = (input) -> input.length();
        System.out.println(function.apply("I am good"));

        Function<String,Integer> functionMethodRef = String::length;
        System.out.println(functionMethodRef.apply("I am good"));

        Consumer<String> consumerLambdaExpression = (input) -> System.out.println(input);
        consumerLambdaExpression.accept("consumer");

        Consumer<String> consumerMethodReference = System.out::println;
        consumerMethodReference.accept("consume method reference");

        Supplier<String> supplier = () -> "Meghraj";
        System.out.println(supplier.get());


        String name = " Radha ";

        Optional.of(name)
                .map(String::trim)
                .filter(input->input.contains("Radha"))
                .ifPresent(System.out::println);



    }

}
