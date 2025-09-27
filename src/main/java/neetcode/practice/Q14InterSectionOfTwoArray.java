package neetcode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q14InterSectionOfTwoArray {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};


        for(int num : findIntersection(nums1,nums2)){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int num : findIntersection(nums3,nums4)){
            System.out.print(num+" ");
        }
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
