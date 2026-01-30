package blind75;

public class Q19RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       int[][] result = rotateAnImage(matrix);

       for(int i=0; i<result.length;i++){
           for(int j=0;j<result.length;j++){
               System.out.print(result[i][j]+" ");

           }
           System.out.println();
       }


        /* output
        *{
    {15, 13,  2,  5},
    {14,  3,  4,  1},
    {12,  6,  8,  9},
    {16,  7, 10, 11}
}

        *
        * */


    }

    public static int[][] rotateAnImage(int[][] matrix){

        int lengthOfMat = matrix.length;

        for(int i=0;i<lengthOfMat;i++){
            for(int j=i; j<lengthOfMat;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        for(int i=0; i<lengthOfMat;i++){
            for (int j=0; j<lengthOfMat/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][lengthOfMat-j-1];
                matrix[i][lengthOfMat-j-1] = temp;
            }
        }
        return matrix;
    }
}
