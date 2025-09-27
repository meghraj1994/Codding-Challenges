package neetcode;

import java.util.HashMap;
import java.util.Map;

public class A3TwoSum {
    public static void main(String[] args) {

        int[] nums = {12, 7, 2, 11};
        int target = 9;

        int[] nums1 = {1, 1};
        int target1 = 2;

        for(int num : twoSum(nums1, target1)){
            System.out.println(num);
        }
//        System.out.println(twoSum(nums, target));           // output = [1,2]
//        System.out.println(twoSum(nums1, target1));         //output =[0,1]


    }

    public static int[] twoSum(int[] nums, int target) {

        //logic : use hashMap -> iterate to all nums and check for each element reminder, if remider is already present then return its indices or just add it for future possible result

        //step1 : decided hashMap as data structure
        Map<Integer, Integer> map = new HashMap<>();

        //step2: iterate to each element
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            //step3: check if this remaining is already present in map
            if (map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            }
            map.put(nums[i], i);
        }


        return new int[]{};
    }
}
