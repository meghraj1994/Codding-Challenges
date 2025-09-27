package multithreading.durgasoft;

public class RunnableDemo {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread t = new Thread();
        System.out.println(t.getName());

    }



}
