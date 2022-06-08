package leetcode;

public class MaximumSubarray {
    /*
      Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has the largest sum = 6.
      Input: nums = [1] Output: 1
      Input: nums = [5,4,-1,7,8] Output: 23
    */

    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }

    public static int maxSubArray(int[] nums) {
      int currentSum = 0;
      int bestSum=Integer.MIN_VALUE;

      for(int i=0; i<nums.length;i++) {
          currentSum = Math.max(nums[i],currentSum+nums[i]);
          bestSum = Math.max(currentSum,bestSum);
      }
      return bestSum;
    }

}
