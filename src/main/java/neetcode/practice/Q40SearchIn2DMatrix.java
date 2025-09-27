package neetcode.practice;

public class Q40SearchIn2DMatrix {
    public static void main(String[] args) {
      int[][] matrix = new int[3][4];
      matrix[0][0]=1;
      matrix[0][1]=3;
      matrix[0][2]=5;
      matrix[0][3]=7;
      matrix[1][0]=10;
      matrix[1][1]=11;
      matrix[1][2]=16;
      matrix[1][3]=20;
      matrix[2][0]=23;
      matrix[2][1]=30;
      matrix[2][2]=34;
      matrix[2][3]=60;

        System.out.println(searchIn2DMatrix(matrix, 3));
    }

    public static boolean searchIn2DMatrix(int[][] matrix, int target) {

        int m = matrix.length;         //m*n = row length * column Length
        int n = matrix[0].length;

        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = matrix[mid / m][mid % m];

            if (midValue == target) {
                return true;
            } else if (target > midValue) {
                start = start + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
