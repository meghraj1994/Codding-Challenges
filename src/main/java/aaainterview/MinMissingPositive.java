package aaainterview;

import java.util.Arrays;
import java.util.HashSet;

public class MinMissingPositive {
    public static void main(String[] args) {
        int[] testCase1 = {3, 0, 1, 4, 5, 7, 6};
        int[] testCase2 = {10, 8, 11, 12, 13};

        System.out.println("Output of test1: " + findMinMissingPositive(testCase1));
        System.out.println("Output of test2: " + findMinMissingPositive(testCase2));
    }

//    public static int findMinMissingPositive(int[] nums) {
//        Arrays.sort(nums); // Sort the array
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i + 1] - nums[i] != 1) {
//                return nums[i] + 1;
//            }
//        }
//
//        // If no missing number found, return -1 or handle it accordingly
//        return -1;
//
//    }

//    public static int findMinMissingPositive(int[] nums) {
//        int maxNum = Integer.MIN_VALUE;
//
//        // Find the maximum number in the given array
//        for (int num : nums) {
//            if (num > maxNum) {
//                maxNum = num;
//            }
//        }
//
//        boolean[] present = new boolean[maxNum + 1]; // Array to mark the presence of numbers
//
//        // Mark the presence of each number in the given array
//        for (int num : nums) {
//            present[num] = true;
//        }
//
//        // Find the missing number
//        for (int i = 0; i < present.length; i++) {
//            if (!present[i]) {
//                return i;
//            }
//        }
//
//        // If no missing number found, return -1 or handle it accordingly
//        return -1;
//    }

//    public static int findMinMissingPositive(int[] nums) {
//        int missingNumber = nums.length; // Initialize missingNumber with n (length of array)
//
//        // XOR all the elements and indices
//        for (int i = 0; i < nums.length; i++) {
//            missingNumber ^= i ^ nums[i];
//        }
//
//        return missingNumber;
//    }

    public static int findMinMissingPositive(int[] nums) {
        // Find the minimum and maximum numbers in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Create a boolean array to mark which numbers are present
        boolean[] present = new boolean[max - min + 1]; // Include the range from min to max, plus 1 for 0

        // Mark each number from the array as present
        for (int num : nums) {
            present[num - min] = true; // Adjust index based on min
        }

        // Find the missing number
        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                return i + min; // Adjust index based on min
            }
        }

        // If no missing number found, return -1 (or any appropriate value)
        return -1;
    }
}
