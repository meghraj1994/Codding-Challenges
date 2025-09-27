package multithreading.durgasoft.sychronizeddemo;


class Display {

    public void wish(String name) {
        //1 lakh line code
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                System.out.print("Good Morning : ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Thread Got Interrupted");
                }
                System.out.println(name);
            }
        }
        // 1 lakhs line of code
    }

}


class Mythread1 extends Thread {

    private Display d;
    private String name;

    public Mythread1(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }

}


public class SynchronizedBlockThisDemo {

    public static void main(String[] args) {

        Display d = new Display();
        Mythread1 t1 = new Mythread1(d, "Meghraj");
        Mythread1 t2 = new Mythread1(d, "Sukanya");
        t1.start();
        t2.start();

    }
}
