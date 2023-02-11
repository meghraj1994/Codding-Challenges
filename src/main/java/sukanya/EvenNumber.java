package sukanya;

public class EvenNumber {

    int num;

    static int findingEvenOrOdd( int num) {
        if (num % 2 == 0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");

        return num;
    }

    public static void main(String[] args) {
        findingEvenOrOdd(75);

    }


}
