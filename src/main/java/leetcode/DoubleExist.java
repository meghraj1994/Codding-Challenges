package leetcode;

import java.util.HashSet;
import java.util.Set;

public class DoubleExist {
    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
//        Output: true


        int[] arr2 = {7, 1, 15, 11};
//        Output: true


        int[] arr3 = {3, 1, 7, 11};
//        Output: false

        System.out.println(checkIfExist(arr1));
        System.out.println(checkIfExist(arr2));
        System.out.println(checkIfExist(arr3));

    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num) || (set.contains(num / 2) && num%2==0))
                return true;
            set.add(num);
        }
        return false;
    }


}



