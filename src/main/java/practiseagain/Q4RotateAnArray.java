package practiseagain;

import java.util.Arrays;

public class Q4RotateAnArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for (int i : rotatedArray(nums, k)) {
            System.out.print(i + " ");
        }
    }

    public static int[] rotatedArray(int[] nums, int k) {

        int n = nums.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[(i+k)%n] = nums[i];
        }
        return newArray;
    }
}
