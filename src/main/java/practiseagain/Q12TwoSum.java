package practiseagain;

import java.util.HashMap;
import java.util.Map;

public class Q12TwoSum {

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        for(int n : twoSum(nums3,target3)){
            System.out.print(n+" ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum = target - nums[i];
            if (map.containsKey(requiredNum)) {
                return new int[]{i, map.get(requiredNum)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
