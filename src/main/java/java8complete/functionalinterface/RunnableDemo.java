package java8complete.functionalinterface;





public class RunnableDemo {

    public static void main(String[] args) {

        System.out.println("This is main thread....!!!!");
        Thread th = new Thread(() -> System.out.println("This is runnable thread......!!!!"));
        th.start();
        System.out.println("2 main thread");

    }


}
