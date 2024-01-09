package multithreading.deadlock;


class Thread1 extends Thread {

    Object book;
    Object pen;

    public Thread1(Object book, Object pen) {
        this.book = book;
        this.pen = pen;
    }

    public void run() {
        synchronized (book) {
            System.out.println("thread 1 : acquired lock on book object.....!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 1 : waiting to acquired lock on Pen.......");
            synchronized (pen) {
                System.out.println("thread 1 : acquired lock on Pen.......");
            }
        }
    }
}

class Thread2  extends Thread {


    Object book;
    Object pen;

    public Thread2(Object book, Object pen) {
        this.book = book;
        this.pen = pen;
    }

    public void run() {
        synchronized (pen) {
            System.out.println("thread 2 : acquired lock on pen object.....!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 2 : waiting to acquired lock on Book.......");
            synchronized (book) {
                System.out.println("thread 2 : acquired lock on Book.......");
            }
        }
    }


}


public class DeadLockExample {

    public static void main(String[] args) {
        Object book = new Object();
        Object pen = new Object();

//i f e for different objects then there ill be no deadlock
//        Object book1 = new Object();
//        Object pen1 = new Object();

        new Thread1(book,pen).start();
        new Thread2(book,pen).start();


    }
}
