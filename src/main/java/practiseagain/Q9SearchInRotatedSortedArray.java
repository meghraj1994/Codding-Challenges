package practiseagain;

public class Q9SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(searchInRotedSortedArray(nums, target));
    }

    public static int searchInRotedSortedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] < nums[mid]) {
                if (target < nums[start] || target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target <nums[mid] || target > nums[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
