package blind75;

public class Q8BinarySearch {
    public static void main(String[] args) {


        /*
         * sorted array --> think of binary search
         * T(n) = log(n)
         * s(n) = O(1)
         *
         * */

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {7, 6, 5, 4, 3, 2, 1};
        int target = 7;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(arr1, target));
    }


    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[end] > arr[start];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
