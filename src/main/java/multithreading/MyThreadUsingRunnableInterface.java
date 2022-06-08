package multithreading;

//way1 to create thread
public class MyThreadUsingRunnableInterface implements Runnable{
    public static void main(String[] args) {
        MyThreadUsingRunnableInterface t = new MyThreadUsingRunnableInterface();
        Thread thread = new Thread(t);

        CreatingThreadUsingThreadClass t2 = new CreatingThreadUsingThreadClass();
        thread.start();
        t2.start();
    }



    @Override
    public void run() {

        for(int i=0; i<10;i++){
            System.out.print(i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
