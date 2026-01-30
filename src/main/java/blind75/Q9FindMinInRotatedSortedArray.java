package blind75;

public class Q9FindMinInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,4,4,5, 6, 7, 8, 9, 0,0,0, 1, 2, 3};

        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {


        /*
        * whenever you get something like sorted array ===> BST t(n) = log(n) and s(p) = o(1)
        *
        *
        *
        *
        * */

        int start=0;
        int end = nums.length-1;

        while (start < end){

            int mid = start+(end-start)/2; // start=0 end = 9 ==> mid = 4

            if(nums[mid] > nums[end]){
                start = mid+1;
            } else if (nums[mid]< nums[end]) {
                end=mid;
            } else {
                end--;
            }

        }
        return nums[start];
    }
}
