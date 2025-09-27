package neetcode.practice;

import java.util.*;

public class Q38FindPairWhoSumEqualTarget {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 7, 5, 8, 6, 4);
        int target = 10;

        System.out.println(findPairsOptimal(nums, target));
    }

    public static List<List<Integer>> findPairsOptimal(List<Integer> nums, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                int a = Math.min(num, complement); // to remove duplicates like 2,3 and 3,2
                int b = Math.max(num, complement);
                result.add(Arrays.asList(a, b)); // avoid duplicate order
            }
            seen.add(num);
        }

        return new ArrayList<>(result);
    }

}
