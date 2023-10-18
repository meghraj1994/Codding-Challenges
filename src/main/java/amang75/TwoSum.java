package amang75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] num1 = {2,7,11,15};
        int target1= 9;
        int[] num2 = {3,3};
        int target2 = 6;

        System.out.println(Arrays.toString(twoSum(num1, target1)));
        System.out.println(Arrays.toString(twoSum(num2, target2)));


    }

    public static int[] twoSum(int[] nums, int target) {
         int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int diff = target - nums[i];
            if(!map.containsKey(diff)){
                map.put(nums[i],i);
            } else {
                result[0] = i;
                result[1] = map.get(diff);
            }

        }
        return result;

    }

}
