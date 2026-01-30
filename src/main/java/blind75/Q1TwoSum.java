package blind75;

import java.util.HashMap;

public class Q1TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5, 8};
        int target = 9;
        for (int i : twoSum(nums, target)) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer required = target - nums[i];
            if (map.containsKey(required)) {
                return new int[]{i, map.get(required)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
