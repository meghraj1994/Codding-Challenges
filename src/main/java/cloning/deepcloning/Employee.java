package cloning.deepcloning;

public class Employee implements Cloneable{

    private String name;
    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee em =(Employee) super.clone();
        em.setAddress((Address) address.clone() );
        return em;
    }

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
