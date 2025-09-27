package neetcode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5FindAllDuplicatesFromArray {

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1}; //output = [2,3]
        int[] nums2 = {1, 1, 2};    //output = [1]
        int[] nums3 = {1};   //output = [];


        System.out.println(findAllDuplicatesUsingHashMap(nums1).toString());
        System.out.println(findAllDuplicatesUsingHashMap(nums2).toString());
        System.out.println(findAllDuplicatesUsingHashMap(nums3).toString());

        System.out.println("-----------------");

        System.out.println(findAllDuplicates(nums1).toString());
        System.out.println(findAllDuplicates(nums2).toString());
        System.out.println(findAllDuplicates(nums3).toString());
    }

    public static List<Integer> findAllDuplicatesUsingHashMap(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static List<Integer> findAllDuplicates(int[] nums){
        if (nums.length == 0 || nums.length == 1) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        for(int i=0; i< nums.length;i++){
            int index = Math.abs(nums[i])-1;    //trying to find index value

            if(nums[index] < 0){     //show that this value is already seen
                 result.add(Math.abs(nums[index]));
            }
            nums[index] = -nums[index];
        }
        return result;
    }
}
