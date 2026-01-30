package blind75.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Coding {

    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student(1,"Rohit",30, "Male", "Mechanical Engineering", "Mumbai",122, Arrays.asList("+91123456789", "+911234543672")),
                new Student(5,"Rama",30, "Male", "Mechanical Engineering", "Mumbai",12, Arrays.asList("+91123456789", "+911234543672")),
                new Student(9,"raha",30, "Male", "Mechanical Engineering", "Mumbai",22, Arrays.asList("+91123456789", "+911234543672")),
                new Student(2,"Meghraj",31, "Male", "Electrical Engineering", "ckm",1, Arrays.asList("+91123456789", "+912725242662")),
                new Student(3,"Sukanya",29, "Female", "Electrical Engineering", "ckm",2, Arrays.asList("+91123456789","+91291382173721")),
                new Student(4,"Anvi",30, "Male", "CS Engineering", "ckm",22, Arrays.asList("+91123456789", "+0913812y84816481"))

        );

        System.out.println("1)--------find the student whose rank between 0 to 10");
        students.stream()
                .filter(student -> student.getRank()>0 && student.getRank()<10)
                .collect(Collectors.toList())
                .forEach(System.out::println);




        System.out.println("--2) find the student and who lives in ckm and sorted by name in reverse order------------------");

        students.stream()
                .filter(student -> student.getCity().equals("ckm"))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                .forEach(System.out::println);


        System.out.println("---3)-------get all unique departments---------------");
        students.stream()
                .map(Student::getDept)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("---4) get all contacts --flatmap()------------------");

      students.stream()
              .flatMap(student -> student.getContacts().stream())
              .collect(Collectors.toList())
              .forEach(System.out::println);


        System.out.println("--------5) -group by department name------------");
        Map<String, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getDept));


        System.out.println("---6)-groupBy department and number of student counts-------");

        Map<String, Long> st1= students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));


        System.out.println("---7)-----find the department which has max number of student----------");

        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).get());

        System.out.println("---------8) find the average age of male and female students-----");


        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge))));

        System.out.println("---9) find highest rank in each department______");

        Map<String, Optional<Student>> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));

        System.out.println(collect1);

        System.out.println("---10)-- find the student who has second rank--");


        System.out.println(students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(1)
                .findFirst()
                .get());



        String input = "iloveyoumeghraji";

        Map<String, Long> collect2 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);

        Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry ->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("---find first uniuqe element------");
        String firstUniqueElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(firstUniqueElement);


        int[] numbers = {5,9,11,2,8,21,1};


        Integer secondHighestNumber = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println(secondHighestNumber);


           String[] strArray = {"java", "meghraj", "springboot", "miroservices"};

        String longestStringInAnArrray = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestStringInAnArrray);



        int[] nums = {5,9,11,2,8,21,1};

        List<String> numbersStartWith1 = Arrays.stream(nums)
                .boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());


        System.out.println(numbersStartWith1);



        List<String> nos = Arrays.asList("1","2","3","4");

        String join = String.join("-", nos);
        System.out.println(join);



    }



}
