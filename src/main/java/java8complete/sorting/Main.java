package java8complete.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(10, "Ramesh", 30, 10000),
                new Employee(20, "Meghraj", 29, 20000),
                new Employee(30, "Sukanya", 30, 15000),
                new Employee(40, "Anajan", 8, 40000)
        );

        Employee emp = new Employee();
        employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-----------revered----------------");

        employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .forEach(System.out::println);


        System.out.println("-----------sort by name----------------");

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("-----------Map example1----------------");

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
        nums.stream().map(n->n*2)
                .forEach(System.out::println);

    }
}
