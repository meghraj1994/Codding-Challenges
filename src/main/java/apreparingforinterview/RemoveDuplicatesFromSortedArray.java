package apreparingforinterview;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

//        int[] nums1 = {1,1,2};
//        System.out.println(removeDuplicates(nums1));
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));

    }

    public static int removeDuplicates(int[] nums) {
         int counter = 0;
        for(int i=1; i < nums.length;i++) {
            if(nums[i]!=nums[counter]) {
                nums[counter] = nums[counter];
                counter++;
                nums[counter]=nums[i];
            }
        }
        return counter+1;


    }
}
