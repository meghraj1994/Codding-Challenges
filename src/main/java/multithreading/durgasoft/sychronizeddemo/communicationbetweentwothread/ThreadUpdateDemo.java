package multithreading.durgasoft.sychronizeddemo.communicationbetweentwothread;



class MyThread extends Thread {
    int total =0;
    public void run() {

        synchronized (this) {
            System.out.println("Child thread starts calculation");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child thread is trying to give notification");
            this.notify();
        }

    }



}


public class ThreadUpdateDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();

        synchronized (t1) {
            System.out.println("Main thread calling wait() method");
            t1.wait();
            System.out.println("Main Thread got notification call");
            System.out.println(t1.total);
        }


    }
}
