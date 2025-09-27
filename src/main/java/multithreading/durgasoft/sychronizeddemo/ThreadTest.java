package multithreading.durgasoft.sychronizeddemo;

class ThreadB extends Thread {
    int total = 0;

    public void run() {
        for (int i = 0; i <= 100; i++) {
            total = total + i;
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        ThreadB b = new ThreadB();
        b.start();
        System.out.println(b.total);
    }
}
