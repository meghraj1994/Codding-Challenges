package multithreading.bankmultithreading;

public class MainClass {

    public static void main(String[] args) {

        SBI accountA = new SBI(2000);

        GooglePeThread googlePeThread = new GooglePeThread(accountA);
        AtmThread atmThread = new AtmThread(accountA);

        googlePeThread.setName("GooglePe");
        atmThread.setName("ATM");

        googlePeThread.start();
        atmThread.start();


    }
}
