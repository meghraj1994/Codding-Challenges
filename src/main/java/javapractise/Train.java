package javapractise;

public class Train implements Transport {
    @Override
    public void start() {
        System.out.println("Train trip started....");
    }

    @Override
    public void trip() {
        System.out.println("train trip is on.....");
    }
}
