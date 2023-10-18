package apreparingforinterview.mutlithreading;

public class CreatingThreadUsingRunnableInterface implements Runnable{
    @Override
    public void run() {
      for (int i=0; i<=5; i++) {
          System.out.println("Ram");
          try {
              Thread.sleep(3000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
    }
}
