package practiseagain;

public class Q10FindMinInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(findMinInRotatedSortedArray(nums));
        System.out.println(findMinValue(nums));
    }

    public static int findMinInRotatedSortedArray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int minValue = nums[0];
        while (start < end) {

            if (nums[start] < nums[end]) {
                minValue = Math.min(nums[start], minValue);
            }

            int mid = start + (end - start) / 2;
            minValue = Math.min(minValue, nums[mid]);
            if (nums[start] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return minValue;
    }

    public static int findMinValue(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
