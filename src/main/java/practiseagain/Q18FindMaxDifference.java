package practiseagain;

public class Q18FindMaxDifference {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};    // o/p = 4
        int[] nums1 = {9, 4, 3, 2};      // o/p = -1;
        System.out.println(findMaximumDifference(nums));
        System.out.println(findMaximumDifference(nums1));
    }

    public static int findMaximumDifference(int[] nums) {

        //max diff = maxValue - lowestValue
        // maxDiff = nums[i] - nums[j]      where i<j<n

        int minValue = nums[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
            maxDiff = Math.max(maxDiff, nums[i] - minValue);

        }
        return maxDiff > 0 ? maxDiff : -1;

    }
}
