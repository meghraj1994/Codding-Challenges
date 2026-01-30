package blind75;

public class Q11ConsecutiveSum {

    public static void main(String[] args) {
        int[] nums = {1,8,6,10,22,3,44};
        int target =35;  //o/p = true
        int target2=13;  //o/p=false

        System.out.println(consecutiveSum(nums, target));
        System.out.println(consecutiveSum(nums, target2));
    }


    public static boolean consecutiveSum(int[] nums, int target){

        int point=0;
        int currentSum=0;

        for(int i=0; i<nums.length;i++){
            currentSum += nums[i];               //1+8+6+22=
            while (currentSum > target){
                currentSum -=nums[point];
                point++;
            }

            if(currentSum == target) return true;
        }
        return false;
    }
}
