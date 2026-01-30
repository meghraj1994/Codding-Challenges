package blind75;

import java.util.HashSet;
import java.util.Set;

public class Q18ValidSudoku {

    public static void main(String[] args) {
        char[][] valid = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] inValid = {
                {'8','3','.','.','7','.','.','.','.'}, // ❌ duplicate '8' in first column
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(valid));
        System.out.println(isValidSudoku(inValid));
    }

    public static boolean isValidSudoku(char[][] board){

        Set<String> visited = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0; j<9;j++){
                char ch = board[i][j];

                if(ch !='.'){
                    if(!visited.add(ch+"exist in row"+i) || !visited.add(ch+"exist in col"+j) || (!visited.add(ch+"exist in 3*3 matrix"+i/3+j/3))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }


}
