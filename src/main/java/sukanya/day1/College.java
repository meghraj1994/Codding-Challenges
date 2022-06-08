package sukanya.day1;

public class College {
    public String collegeName;
    public int numberOfStudents;
    public  boolean isPrivate;
    public int feesPerStudent;
    public int totalIncome;


    //Total income of college
    public int calculateTotalIncome(int numberOfStudents, int feesPerStudent){
        totalIncome=numberOfStudents*feesPerStudent;
        return totalIncome;
    }

    //College status
    public boolean collegeStatus(Boolean isPrivate){
        return isPrivate;
    }

}
