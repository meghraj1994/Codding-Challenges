package java8features.streamapi.sortingstreamapi;

public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private Long salary;

    public Employee(Integer id, String name, Integer age, Long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id " + this.id + " name " + this.name + " salary " + this.salary + " age " + this.age;
    }
}
