package cloning.shallocloning;


/*
* 1)shallow cloning is by default cloning
* 2)if your class has reference of another class like(employee has reference of address class) and if you
* clone employee and if change anything in cloned object it will also change in original object
* 3)It is more fast, efficient and if your class has only primitive data type then shallow cloning is same
* as deep cloning
*
* */

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Irving","TX","USA");
        Employee emp1 = new Employee("meghraj",address);

        //lets clone employee1
        Employee emp2 =(Employee) emp1.clone();
        emp2.getAddress().setCity("Dallas");


        //printing employee
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
