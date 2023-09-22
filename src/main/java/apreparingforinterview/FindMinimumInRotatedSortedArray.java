package apreparingforinterview;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

//    Example 1:
        int[] nums1 = {3, 4, 5, 1, 2};  // Output: 1
//    Explanation: The original array was [1,2,3,4,5] rotated 3 times.

//    Example 2:
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2}; // Output: 0
//    Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

//    Example 3:
        int[] nums3 = {11, 13, 15, 17}; // Output: 11
//    Explanation: The original array was [11,13,15,17] and it was rotated 4 times.

        int[] nums4 = {2,3,4,5,1};

        System.out.println(findMin(nums4));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

         while (start < end) {
             int mid = start + (end-start)/2;

             //check if mid-value is greater than end means smaller value lies after mid
             // so make start = mid+1 else
             // if mid-value is less that end means smaller lies bet mid and start
             // end = mid

             if(nums[mid] > nums[end]) start = mid+1;
             end =mid;
         }
         return nums[start];

    }

}
