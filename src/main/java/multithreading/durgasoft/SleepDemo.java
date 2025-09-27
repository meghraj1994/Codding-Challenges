package multithreading.durgasoft;


class Mythread extends Thread {


    public void run() {
        try {
            for (int i = 0; i < 9; i++) {
                System.out.println("i am lazy thread...!!!");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Thread is interrupted");
        }
    }
}

public class SleepDemo {

    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.interrupt();

    }
}
