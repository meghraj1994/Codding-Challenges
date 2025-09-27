package java8complete.sorting;

public class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;


    public Employee() {
    }

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : "+id+" name : "+name +" age : "+age+" salary : "+salary;
    }
}
