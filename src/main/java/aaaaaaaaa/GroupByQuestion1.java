package aaaaaaaaa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByQuestion1 {


    //cas1 : Employee list
    public static void main(String[] args) {
        System.out.println("Code start from here .......");

        System.out.println("case1: employee class with groupby");
        List<Employee> employeeList = Arrays.asList(
                new Employee("Meghraj", "IT", 30),
                new Employee("Sukanya", "IT", 30),
                new Employee("Dr Sridevi", "Medical", 35),
                new Employee("Anjan", "Student", 7),
                new Employee("Anvesha", "Student", 9),
                new Employee("Soundaraya", "IT", 28));


        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)))
                .forEach((department, age) -> System.out.println(department + " - " + age));

        employeeList.stream()
                .filter(employee -> employee.getDepartment() == "IT")
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(employee -> System.out.println(employee.toString()));


        System.out.println("----case 2 : count each char of a given String-------");
        String input = "java8stream";

        input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " - " + value));


        System.out.println("----case3 : Join List Of Strings With Prefix,Suffix And Delimeter----");
        //   Preefix-apple,banana,cherry-Suffix

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        System.out.println(fruits.stream().collect(Collectors.joining(",", "pre-", "-suffix")));


        //case 4 :  find first non repeated char of given String
        // String s = "TroubleShooter", output = 1
        System.out.println("........case4 find non repeated char from a given string..........");
        String s = "troubleShooter";

        Character character = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        if (character != null) {
            System.out.println("character : " + character);
        } else {
            System.out.println("character is null");
        }

        Map<Character, Integer> map = new LinkedHashMap<>();
        Character returnChar = null;
        for (char ch : s.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                returnChar = entry.getKey();
                break;
            }
        }
        System.out.println("----------using LinkedHashMap concept---------");
        System.out.println(returnChar);

    }

}


class Employee {

    String employeeName;
    String department;
    int age;


    public Employee(String employeeName, String department, int age) {
        this.employeeName = employeeName;
        this.department = department;
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name : " + employeeName + " " + " department " + department + " age " + age;
    }
}
