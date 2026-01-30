package blind75;

public class Q5RotateAnArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for (int i : rotateAnArray(nums, k)) {
            System.out.print(i + " ");
        }
        /*0 1 2 3 4 5 6     index
        * 1 2 3 4 5 6 7     original array
    1st * 7 1 2 3 4 5 6
    2nd * 6 7 1 2 3 4 5
    3rd * 5 6 7 1 2 3 4     => 0th - 3rd ( i+k)%n => (0+3)%7=3
    *                       => 1nd - 4th           => (
    *                       =>2nd - 5th
    *                       =>3th - 6th
    *                       =>4th - 1st
    *                       =>5th -2nd
    * */
    }

    public static int[] rotateAnArray(int[] nums, int k) {

        int n = nums.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = newArray[i];
        }
        return nums;
    }
}
