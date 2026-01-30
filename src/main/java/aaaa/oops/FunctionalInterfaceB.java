package aaaa.oops;


@FunctionalInterface
public interface FunctionalInterfaceB extends FunctionalInterfcaeA{
//    void laungh();

    static void check() {
        System.out.println("B : cehck");
    }


    default void checkB() {
        System.out.println("B : checkB");
    }
}
