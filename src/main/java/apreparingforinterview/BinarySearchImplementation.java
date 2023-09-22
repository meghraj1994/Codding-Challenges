package apreparingforinterview;

public class BinarySearchImplementation {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 3;

        System.out.println(binarySearch(nums, target));

    }

    public static int binarySearch(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                return nums[mid];
            } else if (nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;


    }


}
