package leetcode;

public class SearchInsertPosition {

    /*
     * Input: nums = [1,3,5,6], target = 5 Output: 2
     * Input: nums = [1,3,5,6], target = 2 Output: 1
     * Input: nums = [1,3,5,6], target = 7 Output: 4
     */


    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;


        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));
        System.out.println(searchInsert(nums3, target3));
    }

    public static int searchInsert(int[] nums, int target) {
        int p1 = 0;

        while (p1 < nums.length && nums[p1] < target) {
            p1++;
        }
        return p1;
    }
}
