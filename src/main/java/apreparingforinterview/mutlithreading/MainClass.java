package apreparingforinterview.mutlithreading;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        // 1) creating thread using thread class
//        CreatingThreadUsingThreadClass c = new CreatingThreadUsingThreadClass();
//        c.start();
//        for (int i=0; i<=5;i++){
//            System.out.println("Sukanya");
//            Thread.sleep(2000);
//        }

        //2) creating new thread using runnable class
        CreatingThreadUsingRunnableInterface t = new CreatingThreadUsingRunnableInterface();

        //since runnable interface has only run() not start()
        //since Thread class implements Runnable functional interface so Thread class has both run() and start()
        Thread thread = new Thread(t);

        thread.start();

        for (int i=0 ;i<=5; i++) {
            System.out.println("main method");
        }
    }
}
