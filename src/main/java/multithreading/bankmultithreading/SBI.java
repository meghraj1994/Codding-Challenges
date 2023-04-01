package multithreading.bankmultithreading;


//this is a class
public class SBI {
    private Integer balance;

    public SBI(Integer balance) {
        this.balance = balance;
    }

    //deposit method
    synchronized public Integer deposit(Integer depositAmount) {
         return balance = balance+depositAmount;
    }


    //withdraw method
    synchronized public Integer withDraw(Integer withdrawAmount) {
        return balance = balance-withdrawAmount;
    }
}
