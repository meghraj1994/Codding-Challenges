package neetcode;

import java.util.HashSet;
import java.util.Set;

public class A1ContainsDuplicate {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1}; // output : true
        int[] nums1 = {1, 2, 3, 4, 5}; //output : false;

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums1));
    }

    public static boolean containsDuplicate(int[] nums) {

        //create a hashSet
        Set<Integer> seenNumber = new HashSet<>();

        for (int num : nums) {
            //check if hashSet Contains element already then return true
            if (seenNumber.contains(num)) {
                return true;
            }
            //add element
            seenNumber.add(num);
        }
        //return false
        return false;

    }
}
