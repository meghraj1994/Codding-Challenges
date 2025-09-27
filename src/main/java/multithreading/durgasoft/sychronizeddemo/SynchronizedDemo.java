package multithreading.durgasoft.sychronizeddemo;


class GreetingJob {

    public static synchronized void wish(String name) {
        for (int i = 0; i <= 10; i++) {
            System.out.print("Good Morning : ");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Thread got interrupted");
            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread {

    private GreetingJob g;
    private String name;

    public MyThread(GreetingJob g, String name) {
        this.g = g;
        this.name = name;
    }

    public void run() {
        g.wish(this.name);
    }

}


public class SynchronizedDemo {

    public static void main(String[] args) {

        GreetingJob gb = new GreetingJob();
        GreetingJob gb1 = new GreetingJob();
        MyThread t1 = new MyThread(gb, "Meghraj");
        MyThread t2 = new MyThread(gb1, "Sukanya");

        t1.start();
        t2.start();
    }
}
