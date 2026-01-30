package sounduinterviewprep;


/*
 * Inheritance
 * Abstraction
 * Encapsulation  : make properties as private and use getter/settter to set/get this
 * Polymorphism
 * what is this and super keyword in java ?
 *Constructor :
 * */


public class Car {


    //these are class level or instance lever variable or properties
    private String name;
    private String brand;
    private Integer yearOfMade;


    //constructor :
    public Car(String name, String brand, Integer yearOfMade) {
        this.name = name;
        this.brand = brand;
        this.yearOfMade = yearOfMade;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    //non param constructor
    public Car() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(Integer yearOfMade) {
        this.yearOfMade = yearOfMade;
    }
}
