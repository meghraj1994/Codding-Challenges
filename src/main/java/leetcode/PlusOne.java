package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlusOne {

    /*

    Input: digits = [1,2,3] Output: [1,2,4]
    Input: digits = [4,3,2,1] Output: [4,3,2,2]
    Input: digits = [9] Output: [1,0]

     */
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] digits1 = {4,3,2,1};
        int[] digits2 = {9};

        for(int i : plusOne(digits)) {
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i : plusOne(digits1)) {
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i : plusOne(digits2)) {
            System.out.print(i +" ");
        }
    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if(digits[0]==0) {
            int[] newArray = new int[n+1];
            newArray[0] = 1;
            return newArray;
        }
      return digits;
    }
}
