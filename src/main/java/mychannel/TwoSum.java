package mychannel;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        //Example1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
//        Output: [0,1]

        //Example2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
//        Output: [1,2]

        //Example2
        int[] nums3 = {3, 3};
        int target3 = 6;
//        Output: [0,1]

        for (int i : twoSum(nums3, target3)) {
            System.out.print(i + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            if (map.containsKey(num)) {
                if(i==map.get(num)) continue;
                return new int[]{i,map.get(num)};
            }
        }
        return new int[]{};
    }
}
