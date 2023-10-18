package apreparingforinterview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

//        Example 1:
        int[] nums1 = {2,7,11,15};            // Output: [0,1]  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int target1 = 9;

//      Example 2:
        int[] nums2 = {3,2,4};         // Output: [1,2]
        int target2 = 6;

       // Example 3:
        int[] nums3 = {3,3};      // Output: [0,1]
        int target3 = 6;

       for (int i : twoSum(nums1,target1)) {
           System.out.print(i + " ");
       }


    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i=0; i<nums.length; i++) {
           int required  = target- nums[i];

           if(map.containsKey(required)){
               if(i== map.get(required)) continue;
               return  new int[]{i, map.get(required)};
           }

        }
        return new int[]{};

    }
}
