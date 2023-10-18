package apreparingforinterview.synchronization.withoutsync;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        WithDrawAccount withDrawAccount = new WithDrawAccount(account,10);

        Thread t1 = new Thread(withDrawAccount);
        t1.setName("T1");

        Thread t2 = new Thread(withDrawAccount);
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
