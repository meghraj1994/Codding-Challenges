package designpatterns.observer.withouthobserver;

public class Stock {

    private  String name;
    private double value;

    public Stock(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stock [" +"name :"+name + "Value :"+value + "]";
    }
}
