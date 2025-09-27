package aaaaaInterview;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int result =0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

       return map.entrySet().size();
    }
}
