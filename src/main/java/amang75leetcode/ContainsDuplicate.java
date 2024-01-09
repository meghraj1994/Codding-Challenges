package amang75leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8,1};
        int[] num2 = {1,2,3,4,5,6,7,8,9};

        System.out.println(containDuplicate(num1));
        System.out.println(containDuplicate(num2));
    }

    public static boolean containDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

}
