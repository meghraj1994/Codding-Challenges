package apreparingforinterview.mutlithreading;

public class CreatingThreadUsingThreadClass extends Thread {


    @Override
    public void run(){
        for (int i=0; i<=5;i++){
            System.out.println("Meghraj");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
