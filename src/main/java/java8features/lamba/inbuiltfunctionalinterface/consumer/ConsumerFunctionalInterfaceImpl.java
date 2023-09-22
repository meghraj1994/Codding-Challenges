package java8features.lamba.inbuiltfunctionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceImpl implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("Entered String is  "+s);
    }
}
