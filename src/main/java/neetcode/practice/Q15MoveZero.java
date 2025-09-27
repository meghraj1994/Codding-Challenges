package neetcode.practice;

public class Q15MoveZero {
    public static void main(String[] args) {
        int[] nums ={0,1,0,3,12};
        int[] nums1 ={0};
        moveZero(nums);
        for(int n : moveZero(nums)){
            System.out.print(n+" ");
        }
        System.out.println();

        for(int n : moveZero(nums1)){
            System.out.print(n+" ");
        }


    }
    public static int[] moveZero(int[] nums){
        int pos =0;
        for(int num : nums){
            if(num !=0){
                nums[pos++] = num;
            }
        }
        for(int i = pos;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }
}
