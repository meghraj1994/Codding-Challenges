package multithreading.bankmultithreading;

public class AtmThread extends Thread {

    SBI account;

    public AtmThread(SBI account){
        System.out.println("Inside ATM thread constructor.....");
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("ATM thread method started.......");
         this.account.withDraw(7000);
    }

}
