package neetcode.practice;

public class Q16PlusOne {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {9,9,9};

        for(int n : plusOne(nums1)) {
            System.out.print(n+" ");
        }
        System.out.println();

        for(int n : plusOne(nums2)) {
            System.out.print(n+" ");
        }

    }

    public static int[] plusOne(int[] nums){
        int n= nums.length;

        for(int i=n-1;i>=0;i--){
            if(nums[i] !=9){
                nums[i]++;
                break;
            } else {
                nums[i] =0;
            }

        }
        if(nums[0]==0){
            int[] newArray = new int[n+1];
            newArray[0] =1;
            return newArray;
        }
        return nums;
    }
}
