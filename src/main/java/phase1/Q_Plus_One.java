package phase1;

public class Q_Plus_One {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] digits1 = {9, 9, 9};

        for (int i : plusOne(digits)) {
            System.out.print(i + " ");
        }
        System.out.println("new line___________");
        for (int i : plusOne(digits1)) {
            System.out.print(i + " ");
        }

    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        //check for base condition
    //        if (n == 1 && digits[0] != 9) {
    //            digits[0]++;
    //            return digits;
    //        }

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] arr = new int[n + 1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}
