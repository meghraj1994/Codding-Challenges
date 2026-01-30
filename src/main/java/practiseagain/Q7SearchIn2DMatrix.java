package practiseagain;

public class Q7SearchIn2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target = 16;
        System.out.println(isPresent(matrix, target));
    }

    public static boolean isPresent(int[][] matrix, int target) {

        int m = matrix.length;        //number of row
        int n = matrix[0].length;    //number of column

        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;   //we are finding mid index
            int midValue = matrix[mid / n][mid % n];

            if (target == midValue) {
                return true;
            } else if (target > midValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;
    }
}
