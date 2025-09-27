package phase1;

public class G_Find_Minimum_In_Rotated_Sorted_Array_No_Duplicates {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,1,2,3};

        System.out.println(findMinInRotatedSortedArray(nums));
    }

    //since it is rotated sorted array here we can use Binary Search to

    public static int findMinInRotatedSortedArray(int[] nums){
       int start =0;
       int end=nums.length-1;

       while (end>start){
         int mid = start+ (end-start)/2;

         if(nums[mid]>nums[end]) {
             start = mid+1;
         } else {
             end = mid;
         }
       }
        return nums[start];
    }
}
