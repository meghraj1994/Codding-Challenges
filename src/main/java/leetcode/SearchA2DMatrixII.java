package leetcode;

public class SearchA2DMatrixII {

    public static void main(String[] args) {
        int[][] matrix1 = {                // Output: true
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target1 = 5;


        int[][] matrix2 = {
                {1,    4,  7,  11,   15},   // Output:false
                {2,    5,  8,  12,   19},
                {3,    6,  9,  16,   22},
                {10,   13, 14,  17,  24},
                {18,   21, 23,  26,  30}};

        int target2 = 20;

        System.out.println(searchMatrix(matrix1, target1));
        System.out.println(searchMatrix(matrix2, target2));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >=0) {
            int val = matrix[row][col];
            if(target == val ) return true;
            else if(target > val) row++;
            else col--;
        }
         return false;
    }
}
