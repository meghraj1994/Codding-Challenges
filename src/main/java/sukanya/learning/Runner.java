package sukanya.learning;

public class Runner {

    public static void main(String[] args) {

        Car c = new Car();   // no arg constructor
        Car c1 = new Car("Red","TATA", 20.4);

        c.run();
    }
}
