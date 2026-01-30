package phase1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for(int i : two(nums,target)){
            System.out.println(i);
        }

    }

    public static int[] two(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++) {
            map.put(nums[i],i);
        }

        for(int i=0; i<nums.length;i++){
            int numWeWant = target-nums[i];

            if(map.containsKey(numWeWant)) {
                return new int[] {map.get(numWeWant),i};
            }
        }

        return new int[]{};
    }
}
