package miu;

public class NPrimeable {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if an array is n-primeable
    public static int isNPrimeable(int[] a, int n) {
        for (int num : a) {
            if (!isPrime(num + n)) {
                return 0; // Return 0 if any number + n is not prime
            }
        }
        return 1; // Return 1 if all numbers + n are prime
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {5, 15, 27};
        int n1 = 2;
        System.out.println("Result for array1: " + isNPrimeable(array1, n1)); // Expected: 1

        int[] array2 = {5, 15, 27};
        int n2 = 3;
        System.out.println("Result for array2: " + isNPrimeable(array2, n2)); // Expected: 0

        int[] array3 = {5, 15, 26};
        int n3 = 2;
        System.out.println("Result for array3: " + isNPrimeable(array3, n3)); // Expected: 0

        int[] array4 = {1, 1, 1, 1, 1, 1};
        int n4 = 4;
        System.out.println("Result for array4: " + isNPrimeable(array4, n4)); // Expected: 1

        int[] array5 = {};
        int n5 = 2;
        System.out.println("Result for array5: " + isNPrimeable(array5, n5)); // Expected: 1
    }
}
