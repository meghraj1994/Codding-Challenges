package neetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class Q8TwoSum {
    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3,};
        int target3 = 6;

        for (int num : twoSum(nums1, target1)) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("--------------");

        for (int num : twoSum(nums2, target2)) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("--------------");

        for (int num : twoSum(nums3, target3)) {
            System.out.print(num + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
