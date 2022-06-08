package sukanya.day1;

public class School {
    //properties
    public String schoolName;
    public String address;
    public String headMaster;
    public int zipCode;
    public int numberOfStudents;
    public boolean isGovernment;
    public double schoolFund;
    public double budget;
    public char startsWith;
    public double yearlyExpenditure;
    public double savings;
    public double schoolFees;


    //Methods
    public double calculateSavings(double schoolFund, double budget, double yearlyExpenditure) {
        savings = (schoolFund + budget) - yearlyExpenditure;
        return savings;
    }

    public boolean isGovernmentMethod(boolean isGovernment) {
        return isGovernment;

    }
//Students fees
    public double schoolFees(int numberOfStudents) {
        schoolFees=numberOfStudents*5000;
        return schoolFees;


    }
    // print no of studnets
    public void printNumberOfStudents(int numberOfStudents){
        System.out.println(numberOfStudents);
    }

}
