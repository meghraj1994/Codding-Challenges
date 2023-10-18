package apreparingforinterview.hasmap;

import java.util.Objects;

public class HashMapDemo {

    public static void main(String[] args) {

      Student s1 = new Student(1,"Meghraj");
      Student s2 = new Student(1,"Rama");


        System.out.println(s1.equals(s2));


    }

}

class Student {

    int usn;
    String name;

    public Student(int usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return usn == student.usn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usn);
    }
}
