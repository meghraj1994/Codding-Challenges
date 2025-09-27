package neetcode;

public class A6ProductOfAnArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4}; //output = [24,12,8,6]
        int[] nums1 = {-1,1,0,-3,3}; //output=[0,0,9,0,0]

        for(int i : findProduct(nums)){
            System.out.print(i+" ");
        }
        System.out.println("another example");
        for(int i : findProduct(nums1)){
            System.out.print(i+" ");
        }

    }
//    0 1 2 3
//    1,2,3,4

    public static int[] findProduct(int[] nums){

         //
        int[] result = new int[nums.length];
        int pre=1,post=1;

        //calculating prefix arr
        for(int i=0;i<nums.length;i++){
            result[i] = pre;
            pre=nums[i]*pre;
        }

        //calculation postfix array
        for(int i=nums.length-1;i>=0;i--){
            result[i] = post*result[i];
            post=post*nums[i];
        }


        return result;
    }
}
