package multithreading.durgasoft;


class Venue extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("venue fixing.....!!!!");
        }
    }

}

class CardPrinting extends Thread {

    static Thread venueThread;

    public void run() {
        try {
            venueThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println("Card Printing.....!!!!");
        }
    }

}

class CardDistribution extends Thread {

    static Thread cardPrintingThread;

    public void run() {

        try {
            cardPrintingThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println("Card is distributing.....!!!!");
        }
    }

}

public class YieldMethodDemo {

    public static void main(String[] args) {

        Venue v = new Venue();
        v.start();

        CardPrinting.venueThread = v;

        CardPrinting cp = new CardPrinting();
        cp.start();

        CardDistribution.cardPrintingThread = cp;

        CardDistribution cd = new CardDistribution();
        cd.start();

    }
}
