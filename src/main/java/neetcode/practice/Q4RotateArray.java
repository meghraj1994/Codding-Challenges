package neetcode.practice;

public class Q4RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        for(int n:rotateArray(nums,k)){
            System.out.print(n+" ");
        }
    }

    public static int[] rotateArray(int[] nums,int k){
        int n=nums.length;
        int[] originalArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            originalArray[i] =nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[(i+k)%n] = originalArray[i];
        }
        return nums;
    }
}
