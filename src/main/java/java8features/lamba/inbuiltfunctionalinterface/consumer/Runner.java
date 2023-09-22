package java8features.lamba.inbuiltfunctionalinterface.consumer;

import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {

        System.out.println("traditional OOP concept");
        ConsumerFunctionalInterfaceImpl c = new ConsumerFunctionalInterfaceImpl();
        c.accept("Meghraj");

        System.out.println("__________________________");
        System.out.println("implementing consumer functional interface using lambda expression");


        Consumer<String>  consumer = (s) -> System.out.println(s);
        consumer.accept("Sukanya");
    }
}
