package practiseagain;

public class Q20MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12}; //output = {1,3,12,0,0}
        int[] nums2 = {0};      //output = {0}

        moveZero(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZero(int[] nums) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p1] = nums[i];
                if (p1 != i) {
                    nums[i] = 0;
                }
                p1++;
            }
        }
    }
}
