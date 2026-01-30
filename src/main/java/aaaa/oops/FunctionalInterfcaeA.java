package aaaa.oops;


@FunctionalInterface
public interface FunctionalInterfcaeA {
    void run();


    public default int car() {
        return 7;
    }

    public static void dance() {
        System.out.println("FunctionalInterfcaeA: dance");
    }
}
