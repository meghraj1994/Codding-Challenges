package multithreading.bankmultithreading;

public class GooglePeThread extends Thread{

    SBI account;

    public GooglePeThread(SBI account){
        System.out.println("Inside GooglePe constructor...");
        this.account=account;
    }

    @Override
    public void run(){
        System.out.println("Inside GooglePay Run method");
        this.account.deposit(4000);
    }

}
