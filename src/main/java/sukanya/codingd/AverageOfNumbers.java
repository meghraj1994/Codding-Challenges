package sukanya.codingd;

public class AverageOfNumbers {


    static double averageOfNumers(int[] givenArray) {
        int sum = 0;
        int n = givenArray.length;
        for (int i = 0; i < n; i++) {
            sum += givenArray[i];
        }
        return sum / n;

    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        System.out.println(averageOfNumers(numbers));
    }

}

