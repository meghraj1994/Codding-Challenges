package multithreading.example;



public class Example1 {

    public static void main(String[] args) {
        Thread thread1 = new ThreadMethod();
        thread1.start();

        Thread thread = new Thread(new RunnableExample());
        thread.start();

            for(int i=0; i< 100; i++) {
                System.out.println("Main method");
            }

        }
    }


//2) using runnable interface
class RunnableExample implements  Runnable {
    @Override
    public void run() {
        for(int i=0; i< 100; i++) {
            System.out.println("Runnable Thread");
        }
    }
}

//1) create multi thread : using thread class
class ThreadMethod extends Thread {

    @Override
    public void run() {
        for(int i=0; i< 100; i++) {
            System.out.println("Thread class");
        }
    }

}
