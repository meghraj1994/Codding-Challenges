package sukanya.day1;

public class Runner {
    public static void main(String[] args) {

        //step 1 : create object of classxz
        School s = new School();
        System.out.println(s.calculateSavings(1000, 2000, 1500));
        System.out.println(s.isGovernmentMethod(false));
        System.out.println(s.schoolFees(10));
        s.printNumberOfStudents(10);

        //for college
        College c=new College();
        System.out.println(c.calculateTotalIncome(10, 1000));

        //college status
        System.out.println(c.collegeStatus(false));


        //student results for university
        University u= new University();
        System.out.println(u.calculateResult("sukanya", "4ai12ee044", 720, "distinction", "vtu"));

        System.out.println(u.calculateResult("Meghraj", "4ai12ee025", 800, "distinction", "vtu"));

    }

}
