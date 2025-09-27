package neetcode;

public class A11TwoSumII {

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] nums2 = {2, 3, 4};
        int target2 = 6;

        for (int n : findTwoSumII(nums1, target1)) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : findTwoSumII(nums2, target2)) {
            System.out.print(n + " ");
        }

    }

    public static int[] findTwoSumII(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }

        }
        return new int[]{};
    }
}
