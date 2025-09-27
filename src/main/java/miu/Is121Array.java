package miu;

public class Is121Array {
    public static int is121Array(int[] a) {
        // Check for empty array or if the first or last element is not 1
        if (a.length == 0 || a[0] != 1 || a[a.length - 1] != 1) {
            return 0;
        }

        int startOnes = 0;
        int endOnes = 0;
        int middleIndex = 0;

        // Count 1s at the beginning
        while (middleIndex < a.length && a[middleIndex] == 1) {
            startOnes++;
            middleIndex++;
        }

        // Check if there are 2s in the middle
        if (middleIndex == a.length || a[middleIndex] != 2) {
            return 0;
        }

        // Traverse through the 2s
        while (middleIndex < a.length && a[middleIndex] == 2) {
            middleIndex++;
        }

        // Count 1s at the end
        while (middleIndex < a.length && a[middleIndex] == 1) {
            endOnes++;
            middleIndex++;
        }

        // Ensure no other elements are present
        if (middleIndex != a.length) {
            return 0;
        }

        // Check if the number of 1s at the start equals the number at the end
        return startOnes == endOnes ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(is121Array(new int[]{1, 2, 1})); // Expected: 1
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1})); // Expected: 1
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1})); // Expected: 0
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1})); // Expected: 0
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3})); // Expected: 0
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1})); // Expected: 0
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1})); // Expected: 0
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2})); // Expected: 0
        System.out.println(is121Array(new int[]{2, 2, 2})); // Expected: 0
    }
}
