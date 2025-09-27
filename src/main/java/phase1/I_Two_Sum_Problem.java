package phase1;

import java.util.HashMap;
import java.util.Map;

public class I_Two_Sum_Problem {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;               //output = [0,1]

        int[] nums1 = {3, 2, 4};
        int target1 = 6;          //output=[1,2]

        int[] nums2= {3,3};
        int target2 = 6;        //output = [0,1]

      for(int i : twoSum(nums2, target2)) {
          System.out.println(i);
      }
    }

    public static int[] twoSum(int[] nums, int target) {


        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0; i<nums.length; i++){
            int required = target-nums[i];

            if(map.containsKey(required)){
                if(i==map.get(required)) continue;
                return new int[]{i,map.get(required)};
            }
        }

        return new int[]{};
    }
}
