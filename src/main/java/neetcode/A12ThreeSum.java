package neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A12ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                findTwoSum(i, nums, result);
            }
        }
        return result;
    }

    private static void findTwoSum(int i, int[] nums, List<List<Integer>> result) {
        int left =0;
        int right=nums.length-1;

        while (left<right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum>0){
                right--;
            } else if(sum<0){
                left++;
            } else {
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right || nums[left]==nums[left-1]){
                    left++;
                }
            }
        }
    }
}
