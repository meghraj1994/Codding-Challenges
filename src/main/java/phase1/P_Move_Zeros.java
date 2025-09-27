package phase1;

public class P_Move_Zeros {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums1 = {0};

        moveZeros(nums);
        System.out.println("_________________");
        moveZeros(nums1);
    }

    public static void moveZeros(int[] nums) {

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                if (nonZeroIndex != i) {
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
