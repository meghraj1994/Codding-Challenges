package blind75;

public class Q7MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12}; //o/p= [1,3,12,0,0]
        int[] nums1 = {0}; //o/p=[0]

        moveZeros(nums);
    }


    public static void moveZeros(int[] nums) {
        int noZeroIndex=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i] !=0){
                nums[noZeroIndex] = nums[i];
            if(noZeroIndex !=i){
                nums[i]=0;
            }

            noZeroIndex++;
            }
        }

        for(int num : nums) System.out.println(num);
    }
}
