package practiseagain;

public class Q15ConsecutiveSum {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 10, 22, 3, 44};
        int target1 = 35;    // o/p : true
        int target2 = 13;   //o/p : false;

        System.out.println(doesConsecutiveSumPresent(nums, target1));
        System.out.println(doesConsecutiveSumPresent(nums, target2));
    }

    public static boolean doesConsecutiveSumPresent(int[] nums, int target) {
        int p1 = 0;
        int currenSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currenSum += nums[i];

            while (currenSum > target) {
                currenSum -= nums[p1];
                p1++;
            }

            if (currenSum == target) {
                return true;
            }
        }
        return false;
    }
}
