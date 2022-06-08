package multithreading;

public class Consumer extends Thread {

    Company company;

    public Consumer(Company company){
        this.company=company;
    }

    public void run(){

        while (true){
            this.company.consume_Item();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
