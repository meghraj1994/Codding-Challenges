package apreparingforinterview;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
         reverse(nums);

    }

    public static void reverse(int[] arr) {
        for(int i=0; i<arr.length/2;i++) {
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[other]= temp;
            arr[i] = arr[other];


        }

        System.out.println(Arrays.toString(arr));
    }
}
