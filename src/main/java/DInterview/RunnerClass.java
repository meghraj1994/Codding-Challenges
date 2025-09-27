package DInterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerClass {

    public static void main(String[] args) {

        List<Employee> employeeList  = new ArrayList<>();
        employeeList.add(new Employee("Meghraj", "a", 1234));
        employeeList.add(new Employee("Raj", "b", 12344));
        employeeList.add(new Employee("Mega", "c", 1234));


//        List<Employee> collect =employeeList.stream().filter(e -> e.getfName().startsWith("R")).collect(Collectors.toList());
        List<Employee> collect =employeeList.stream().sorted(Comparator.comparing(Employee::getlName).reversed()).collect(Collectors.toList());
//        employeeList.stream().sorted(Comparator.comparing(Employee::getlName).reversed()).collect(Collectors.toList())

        for(Employee e : collect) {
            System.out.println(e);
        }

    }
}
