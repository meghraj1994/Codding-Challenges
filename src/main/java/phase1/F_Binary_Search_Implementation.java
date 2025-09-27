package phase1;


/*
* 1) This search algorithm is used in a sorted array ie if you want to search any element in a sorted array
* 2) Its time complexity is T(n) = log(n) and space complexity is S(n) = O(1)
*
* */

public class F_Binary_Search_Implementation {

    public static void main(String[] args) {

        int[] nums = {3,4,5,6,7,8,9};
        int target=8;

        System.out.println(findIndexUsingBS(nums,target));
    }

    public static int findIndexUsingBS(int[] nums, int target){

        int start =0;
        int end = nums.length-1;

        while(end>=start){
            int mid = start + (end-start)/2;

            if(nums[mid]==target) {
                return mid;
            } else if(nums[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }
}
