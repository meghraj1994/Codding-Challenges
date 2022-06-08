package javapractise;

public class Flight implements Transport{
    @Override
    public void start() {
        System.out.println("Flight trip started....");
    }

    @Override
    public void trip() {
        System.out.println("Flight trip is on........");
    }
}
