package leetcode;

import java.util.HashMap;

public class TwoSum {
    /*
    * nums = [2,7,11,15] target=9 output=[0,1]
    * nums = [3,2,4] target=6 output=[1,2]
    */

    public static void main(String[] args) {

        int[] num1 = {2,7,11,15};
        int[] num2 = {3,2,4};

        for(int i : twoSum(num2,6)){
            System.out.print(i+" ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int num = target-nums[i];

            if(map.containsKey(num)){
                if(i==map.get(num)) continue;
                return new int[]{map.get(num),i};
            }
        }
        return new int[]{};
    }
}
