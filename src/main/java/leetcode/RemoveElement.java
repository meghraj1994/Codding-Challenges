package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    /*
    * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_]
    *Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_]
     */

    public static void main(String[] args) {
     int[] nums = {3,2,2,3};
     int[] nums1 = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(nums,3));
        System.out.println(removeElement(nums1,2));

    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> newArray = new ArrayList<>();
        int j =0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] !=val){
               newArray.add(nums[i]);
               j++;
            }
        }
        for(int i=0; i<newArray.size();i++){
            nums[i] = newArray.get(i);
        }
        return j;
    }
}
