package blind75;

public class Q16PlusOne {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] nums1 = {9, 9, 9};
        int[] nums2 = {1, 2, 3};

        for(int n : plusOne(nums)) System.out.print(n+" ");
        System.out.println();
        for(int n : plusOne(nums1)) System.out.print(n+" ");
        System.out.println();
        for (int n : plusOne(nums2)) System.out.print(n + " ");

    }

    public static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;


        for (int i = lastIndex; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
