package neetcode.practice;

/*
* this search algo can be applied to find a value from a sorted array
* with time complexity of log(n) and space complexity of O(1)
*
* */
public class Q8BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,73,79,88,92,99};
        int target = 79;
        System.out.println(binarySearch(nums,target));

    }

    public static int binarySearch(int[] nums, int target){

    int start =0;
    int end =nums.length-1;

    while (end > start){
        int mid = start + (end-start)/2;

        if(nums[mid] == target){
            return mid;
        } else if ( nums[mid] < target){
            start = mid +1;
        } else {
            end = mid-1;
        }
    }
        return -1;
    }
}
