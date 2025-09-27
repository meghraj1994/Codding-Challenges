package neetcode.practice;

public class Q7FindMinInRotatedSortedArrayDuplicatesAllowed {

    public static void main(String[] args) {
        int[] nums = {4, 5, 5, 6, 7, 0, 0, 1, 1, 2, 2};

        System.out.println(findMinInRoatedSortedArrayWithDuplicates(nums));
    }

    private static int findMinInRoatedSortedArrayWithDuplicates(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        while (end > start) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                end--;
            }
        }
        return nums[start];
    }
}
