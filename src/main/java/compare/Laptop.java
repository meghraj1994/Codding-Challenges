package compare;

public class Laptop  {
    private String brand;
    private int ram;
    private Integer price;

    public Laptop(String brand, Integer ram, Integer price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name"+ brand+" "+ram+" "+price;
    }
}
