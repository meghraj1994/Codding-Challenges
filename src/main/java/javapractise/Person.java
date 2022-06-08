package javapractise;

public class Person {
    public static void main(String[] args) {

        Transport busTrip = new Bus();
        Transport trainTrip = new Train();
        Transport flightTrip = new Flight();

        Travel travel = new Travel(flightTrip);
        travel.start();


    }
}
