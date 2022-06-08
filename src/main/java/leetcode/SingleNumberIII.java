package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumberIII {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 1, 3, 2, 5};
//        Output: [3,5]
//        Explanation:  [5, 3] is also a valid answer.


        int[] nums2 = {-1, 0};
//        Output: [-1,0]

        int[] nums = {0, 1};
//        Output: [1,0]

        for (int n : singleNumber(nums1)) {
            System.out.print(n + " ");
        }

        System.out.println();

        for (int n : singleNumber(nums2)) {
            System.out.print(n + " ");
        }

        System.out.println();

        for (int n : singleNumber(nums)) {
            System.out.print(n + " ");
        }

    }


    public static int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(nums[i], map.containsKey(nums[i]) ? map.get(nums[i]) + 1 : 1);
        int x = 0;
        for (int i = 0; i < n; i++)
            if (map.get(nums[i]) == 1)
                result[x++] = nums[i];
        return result;
    }

}

/*
*
*  aabbcc ----->6
* aabcc -----> 2a+2c+1b = 5
*
*
*
*
*
*
* */
