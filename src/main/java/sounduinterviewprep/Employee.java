package sounduinterviewprep;

public class Employee {

    //    1) what a class can have   : Properties

        String name = "Soundu";
         int age;
         int salary;      //int,float,double
         String gender;
         boolean isIndia;
         char firstLetterName;

//    2) what a class can do    : Method / Function

      public void run() {
          System.out.println("Employing is running");
       }

       //getter and setter method


    public String getName() {
        return name;
    }           //we are trying to get some property of class

    public void setName(String name) {  //if you want to set some value for that property
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIndia() {
        return isIndia;
    }

    public void setIndia(boolean india) {
        isIndia = india;
    }

    public char getFirstLetterName() {
        return firstLetterName;
    }

    public void setFirstLetterName(char firstLetterName) {
        this.firstLetterName = firstLetterName;
    }
}


