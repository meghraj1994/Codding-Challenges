package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KthLargestNum {

    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
//        Output: 5

        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
//        Output: 4

        System.out.println(findKthLargest(nums1, k1));
        System.out.println(findKthLargest(nums2, k2));

    }

    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        for (int i = nums.length-1; i >= 0; i--) {
            if (i == k) {
                return nums[i];

            }
            break;
        }

        return 0;
    }
}
