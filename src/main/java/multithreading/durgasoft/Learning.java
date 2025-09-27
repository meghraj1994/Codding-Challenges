package multithreading.durgasoft;


class ThreadABC extends Thread {
    int total =0;

    public void run() {
        synchronized (this) {
            System.out.println("Child Thread Start Calculating....!!!");
            for(int i=1; i<=100; i++) {
                 total+=i;
            }
            System.out.println("Child thread is trying to notify the main thread....!!!!");
            this.notify();
        }
    }



        }
public class Learning {

    public static void main(String[] args) throws InterruptedException {

        Thread b = new ThreadABC();
        b.start();
        synchronized (b) {
            System.out.println("Main thread is calling child thread .....!!!!!");
            b.wait();
            System.out.println("Main thread got notification from child thread.....!!!!!");
            System.out.println(((ThreadABC) b).total);
        }

    }
}
