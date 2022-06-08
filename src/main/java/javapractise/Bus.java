package javapractise;

public class Bus implements Transport {
    @Override
    public void start() {
        System.out.println("Bus trip started....");
    }

    @Override
    public void trip() {
        System.out.println("Bus trip is on.....");
    }
}
