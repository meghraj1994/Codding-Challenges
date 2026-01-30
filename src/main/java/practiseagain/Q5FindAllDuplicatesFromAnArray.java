package practiseagain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5FindAllDuplicatesFromAnArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1};

        for (Integer num : findAllDuplicatesUsingHashMap(nums)) {
            System.out.print(num + " ");
        }

        System.out.println("----------Using Optimal Solution-----------");
        for (Integer num : findAllDuplicates(nums)) {
            System.out.print(num + " ");
        }
    }

    /*

     * timeComplexity = O(n)
     * spaceComplexity = O(n)
     *
     * */
    public static List<Integer> findAllDuplicatesUsingHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static List<Integer> findAllDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index]> 0) {
                nums[index] = -nums[index];
            } else {
                result.add(Math.abs(nums[index]));
            }
        }
        return result;
    }
}
