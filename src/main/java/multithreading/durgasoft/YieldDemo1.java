package multithreading.durgasoft;



class ChildThread extends Thread {

    static Thread mt;
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0; i<=3; i++){
           System.out.println("child Thread....!!!!!");
       }
    }
}




public class YieldDemo1 {

    public static void main(String[] args) {

        ChildThread.mt = Thread.currentThread();
        ChildThread ct = new ChildThread();
        ct.start();

        for (int i=0; i<=3; i++) {
            System.out.println("main thread.....!!!!!");
        }
    }
}
