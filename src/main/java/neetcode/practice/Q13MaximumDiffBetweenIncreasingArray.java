package neetcode.practice;

public class Q13MaximumDiffBetweenIncreasingArray {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
        int[] nums1 = {9, 4, 3, 2};

        System.out.println(findMaxDiff(nums));
        System.out.println(findMaxDiff(nums1));
    }

    public static int findMaxDiff(int[] nums) {
        int minValue = nums[0];
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < minValue){
                minValue = nums[i];
            } else {
                maxDiff = Math.max(maxDiff, nums[i]-minValue);
            }
        }
        return maxDiff >=0 ? maxDiff : -1;
    }
}
