package neetcode.practice;

public class Q6FindMinInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,1,2,3};

        System.out.println(findMinInRotatedSortedArray(nums));

    }

    public static int findMinInRotatedSortedArray(int[] nums){
        if(nums.length ==1){
            return nums[0];
        }
        int start =0;
        int end = nums.length-1;

        while (end > start){
            int mid = start + (end-start)/2;

            //case 1 : if mid value is greater than end then min lyies in right of mid
            if(nums[mid] > nums[end]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
