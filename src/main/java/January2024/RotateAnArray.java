package January2024;

import java.util.List;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateAnArray(nums, k);

    }

    public static void rotateAnArray(int[] nums, int k) {
        int n = nums.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = newArray[i];
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }

    }
}
