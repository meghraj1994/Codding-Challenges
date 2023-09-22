package test;

public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;


    public Employee(String firstName, String lastName,String middleName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
    }

    @Override
    public String toString() {
        return this.firstName + this.middleName + this.lastName;
    }
}
