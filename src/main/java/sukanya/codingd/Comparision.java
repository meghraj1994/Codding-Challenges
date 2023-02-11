package sukanya.codingd;

public class Comparision {

static void logicalOperator(int age,int salary){
    System.out.println("\nInside logicalOperators...");


    boolean hasBadCredit=false;

    //1.AND OR AND NOT OPERATORS//
     if ( age<37 && salary > 90000 && ! hasBadCredit) System.out.println("loan approved");
         else {
         System.out.println("not approved");
     }
     }







    public static void main(String[] args) {
    logicalOperator(40,9000);







    }

    }


