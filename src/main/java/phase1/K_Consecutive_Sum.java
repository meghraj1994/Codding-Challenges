package phase1;

public class K_Consecutive_Sum {

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 10, 22, 3, 44};
        int target = 35; //true
        int target1 = 13; //false

        System.out.println(findConsecutiveSum(nums, target));
        System.out.println(findConsecutiveSum(nums, target1));
    }

    public static boolean findConsecutiveSum(int[] nums, int target) {
        int currentSum = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            while (currentSum > target) {
                currentSum -= nums[left];
                left++;
            }
            if (currentSum == target) {
                return true;
            }
        }

        return false;
    }
}
