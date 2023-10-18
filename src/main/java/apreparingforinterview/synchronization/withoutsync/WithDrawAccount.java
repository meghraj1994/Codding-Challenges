package apreparingforinterview.synchronization.withoutsync;

public class WithDrawAccount implements Runnable{

    private BankAccount account;
    private int amount;

    public WithDrawAccount(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        int w = 0;
        for(int i =0; i<20;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (account) {
                System.out.println("Balance before " + Thread.currentThread().getName() + " withdrawal: " + account.getBalance());
                w= account.withDraw(amount);
                System.out.println("Balance after  " + Thread.currentThread().getName() + " withdrawal: " + account.getBalance());
            }
        }
    }
}
