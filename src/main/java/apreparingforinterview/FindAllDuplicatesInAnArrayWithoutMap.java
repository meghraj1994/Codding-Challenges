package apreparingforinterview;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArrayWithoutMap {

    public static void main(String[] args) {
//        Example 1:
        int[] nums1 = {4,3,2,7,8,2,3,1}; //Output: [2,3]

        //        Example 2:
        int[] nums2 = {1,1,2};   // Output: [1]

//        Example 3:
        int[] nums = {1};    // Output: []

        for (int i : findDuplicates(nums1)){
            System.out.print(i+" ");
        }


    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i =0; i<nums.length;i++) {
            int index = Math.abs(nums[i])-1;

            if(nums[index] < 0) result.add(Math.abs(nums[i])); // already visited then add to result
            nums[index] = -nums[index]; //not visited then mark - as visited
        }
        return result;

    }

}
