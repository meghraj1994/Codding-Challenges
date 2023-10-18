public class ConsecutiveSum {

    public static boolean hasConsecutiveSum(int[] nums, int target) {
        int left = 0;          // Left pointer of the window
        int currentSum = 0;    // Current sum of elements in the window

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            // If the current sum exceeds the target, remove elements from the left until it's valid
             while (currentSum > target) {
                currentSum -= nums[left];
                left++;
            }

            // If the current sum equals the target, we found a consecutive sum
            if (currentSum == target) {
                return true;
            }
        }

        // No consecutive sum found that meets the target
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 10, 22, 3, 44};
        int target1 = 35;
        int target2 = 13;

        System.out.println(hasConsecutiveSum(nums, target1)); // Output: true
//        System.out.println(hasConsecutiveSum(nums, target2)); // Output: false
    }
}

