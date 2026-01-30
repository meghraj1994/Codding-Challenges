package practiseagain;

public class Q16SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(findUniqueNumber(nums));

    }

    public static int findUniqueNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
