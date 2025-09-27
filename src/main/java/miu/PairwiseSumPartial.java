package miu;

public class PairwiseSumPartial {

    public static int[] pairwiseSum(int[] a) {
        if (a.length < 2 || a.length % 2 != 0) {
            return null;
        }

        int[] result = new int[a.length / 2];

        for (int i = 0; i < a.length / 2 - 1; i++) {
            result[i] = a[2 * i] + a[2 * i + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {2, 1, 18, -5}; // Expected {3, 13}, but will return {3} due to the bug
        int[] test2 = {2, 1, 18, -5, -5, -15, 0, 0, 1, -1}; // Expected {3, 13, -20, 0, 0}, but will return {3, 13, -20, 0}
        int[] test3 = {2, 1, 18}; // Expected null
        int[] test4 = {}; // Expected null

        System.out.println(java.util.Arrays.toString(pairwiseSum(test1)));
        System.out.println(java.util.Arrays.toString(pairwiseSum(test2)));
        System.out.println(java.util.Arrays.toString(pairwiseSum(test3)));
        System.out.println(java.util.Arrays.toString(pairwiseSum(test4)));
    }
}
