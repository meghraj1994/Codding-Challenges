package January2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesFromAnArray {

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1}; //[2,3]
        int[] nums2 = {1, 1, 2}; //[1]
        int[] nums3 = {1}; //[]

        System.out.println(findDuplicates(nums1).toString());
        System.out.println(findDuplicates(nums2).toString());
        System.out.println(findDuplicates(nums3).toString());
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
