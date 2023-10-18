package apreparingforinterview;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {1,2,3};
//        Output: [1,2,4]

        int[] digits1 = {4,3,2,1};
//        Output: [4,3,2,2]

        int[] digits2 = {9,9,9};

        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));


    }

    public static int[] plusOne(int[] digits) {
         int n= digits.length;
        if(n==1 && digits[0]==0){
            digits[0] =1;
            return digits;
        }
        for (int i=n-1; i>=0; i--) {
            if(digits[i] != 9) {
               digits[i]++;
               break;
            } else {
                digits[i] =0;
            }
        }
        if(digits[0] == 0) {
            int[] arr = new int[n+1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}
