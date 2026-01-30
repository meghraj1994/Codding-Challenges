package practiseagain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q19IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};


        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        for (int num : findIntersection(nums3, nums4)) {
            System.out.print(num + " ");
        }
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            nums1Map.put(num, nums1Map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (nums1Map.containsKey(num) && nums1Map.get(num) > 0) {
                result.add(num);
                nums1Map.put(num, nums1Map.get(num) - 1);
            }
        }


        return result.stream().mapToInt(i -> i).toArray();
    }
}
