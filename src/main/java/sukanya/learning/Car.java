package sukanya.learning;

public class Car {

    //class can have  2 things -
    //propperties - what a class can have

    private String color;
    private String manufactor;
    private double price;


    //method - what a class can do
    public void run(){
        System.out.printf("car is running");
    }

    //
    public Car() {

    }

    public Car(String color, String manufactor, double price) {
        this.color = color;
        this.manufactor = manufactor;
        this.price = price;
    }
}
