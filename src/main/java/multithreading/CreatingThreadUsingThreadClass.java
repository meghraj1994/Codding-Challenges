package multithreading;

public class CreatingThreadUsingThreadClass extends Thread {

    public static void main(String[] args) {

        CreatingThreadUsingThreadClass t = new CreatingThreadUsingThreadClass();
        t.start();

    }

    public void run(){
        for(int i=10; i>=0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
