package DInterview;

public class Employee {

    String fName;
    String lName;
    int phone;

    public Employee(String fName, String lName, int phone) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
