package apreparingforinterview.comparableAndcomparator;

public class Laptop implements Comparable<Laptop> {

    String brand;
    Integer ram;
    Integer price;

    public Laptop(String brand, Integer ram, Integer price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop laptop2) {

        //if object1 > object2 return 1
        if(this.ram > laptop2.getRam()){
            return 1;
        } else {
            //if object1 < object2 return -1
         return -1;
        }
        //if object1 = object2 return 0
    }

}
