//package phase1;
//
//public class H_Find_Minimum_In_Rotated_ed_Array_With_Duplicates {
//
//    public static void main(String[] args) {
//        int[] nums = {4,5,6,7,0,1,2};
//        int[] nums1 = {4,5,6,7,0,1,2,3,4,5,6,7};
//
//        System.out.println(findMin(nums));
//        System.out.println(findMin(nums1));
//    }
//
//    public static int findMin(int[] nums) {
//        int start = 0;
//        int end = nums.length-1;
//
//        while(end>start){
//            int mid = start+(end-start)/2;
//
//            if(nums[mid]>nums[end]){
//                start = mid+1;
//            }else if(nums[mid] < nums[end]) {
//                end = mid;
//            } else {
//                end--;
//            }
//        }
//        return nums[start];
//    }
//}
