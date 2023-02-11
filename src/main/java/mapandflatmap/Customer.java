package mapandflatmap;

import java.util.List;

public class Customer {

    private String name;
    private String email;
    private List<Integer> phoneNumbers;


    public Customer(String name, String email, List<Integer> phoneNumbers) {
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
