package apreparingforinterview.synchronization.withoutsync;


//this is share resource among all threads
public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance=0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int withDraw(int w) {
        int b = getBalance();
        if(w<=b){
            this.balance = this.balance-w;
            return w;
        }
        else {
            return 0;
        }
    }
}
