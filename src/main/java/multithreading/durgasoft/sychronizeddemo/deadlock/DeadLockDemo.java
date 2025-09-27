package multithreading.durgasoft.sychronizeddemo.deadlock;

class A {
    public synchronized void d1(B b) {
        System.out.println("Thread1 started d1() method.....!!!!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted...!!!!!");
        }
        b.last();
    }

    synchronized void last() {
        System.out.println("on object a : Thread 2 is calling last method");
    }

}

class B {
    public synchronized void d2(A a) {
        System.out.println("Thread2 started d2() method.....!!!!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("thread2 got interrupted....!!");
        }
        a.last();
    }

    synchronized void last() {
        System.out.println("on object b : Thread 1 is calling last method");
    }

}

class MyThreadA extends Thread {
    A a;
    B b;

    public MyThreadA(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        a.d1(b);
    }
}

class MyThreadB extends Thread {
    A a;
    B b;

    public MyThreadB(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        b.d2(a);
    }
}

public class DeadLockDemo {

    public static void main(String[] args) {

        A a = new A();
        B b= new B();

        MyThreadA t1= new MyThreadA(a,b);
        MyThreadA t2= new MyThreadA(a,b);
        t1.start();
        t2.start();
    }
}
