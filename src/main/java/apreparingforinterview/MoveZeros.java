package apreparingforinterview;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        Output: [1,3,12,0,0]

        int[] nums1 = {0};
//        Output: [0]

       moveZeroes(nums);
        moveZeroes(nums1);
    }

    public static void moveZeroes(int[] nums) {
      int nonZeroIndex = 0;

      for(int i=0; i<nums.length; i++) {
          if(nums[i] !=0) {
              nums[nonZeroIndex] = nums[i];

              if(nonZeroIndex != i) {
                  nums[i] = 0;
              }
              nonZeroIndex++;
          }
      }

        System.out.println(Arrays.toString(nums));

    }
}