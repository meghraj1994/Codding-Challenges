package java8features.streamapi.sortingstreamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        //1) sorting using stream api comparator method
//        List<String> sortedUsingComparator = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        sortedUsingComparator.forEach(System.out::print);
//
//        //2)sorting using lamda expression
//        List<String> fruits2 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
//        fruits2.forEach(System.out::print);
//
//        //3) sorting using sorted()
//        fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Meghraj", 29, 8000l));
        employeeList.add(new Employee(2, "Sukanya", 28, 8500l));
        employeeList.add(new Employee(3, "Anjan", 6, 2000l));
        employeeList.add(new Employee(4, "Anwesha", 9, 3000l));


        //sort employee by its salary ASC order
        employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("-------------------------------------");
        //sort employee by its salary in DESC order
        employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .forEach(System.out::println);
        System.out.println("------------------------------");
        //sort employee by using lamda express
        employeeList.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return (int) ((o1.getSalary() - o2.getSalary()));
                    }
                }).forEach(System.out::println);
    }
}
