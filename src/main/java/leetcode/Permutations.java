package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        calculatePerm(nums, 0, result, out, visited);


        return result;
    }
    public static void calculatePerm(int[] nums, int index, List<List<Integer>> result, List<Integer> out, boolean[] visited) {
        if (nums.length == index) {
            List<Integer> temp = new ArrayList<>(out);
            result.add(temp);
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            out.add(nums[i]);
            visited[i] = true;

            calculatePerm(nums, index + 1, result, out, visited);

            out.remove(out.size() - 1);
            visited[i] = false;
        }
    }
}
