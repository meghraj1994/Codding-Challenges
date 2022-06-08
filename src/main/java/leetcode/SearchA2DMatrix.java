package leetcode;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 3, 5, 7}
                , {10, 11, 16, 20}
                , {23, 30, 34, 60}
        };
        int target1 = 3;    //Output: true

        int[][] matrix2 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target2 = 13;  //Output: false

        int[][] matrix3 = {{1, 4}, {2, 5}};
        int target3 = 2;  //Output: true

//        System.out.println(searchMatrix(matrix1, target1));
//        System.out.println(searchMatrix(matrix2, target2));
        System.out.println(searchMatrix(matrix3, target3));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;
//
//        int[][] matrix3 = {{1, 4}, {2, 5}};
//        int target3 = 2;  //Output: true
        //using binary search tree
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mid_element = matrix[mid / col][mid % col];
            if (target == mid_element) {
                return true;
            } else if (target < mid_element) {
                end = mid - 1;
            } else if (target > mid_element) {
                start = mid + 1;
            }
        }
        return false;
    }
}
