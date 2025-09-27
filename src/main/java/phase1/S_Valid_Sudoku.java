package phase1;

import java.util.HashSet;
import java.util.Set;

public class S_Valid_Sudoku {

    public boolean isValidSudoku(char[][] board){

        Set<String> visited = new HashSet<>();
        for(int i=0; i<9;i++){
            for(int j=0; i<9;j++){
                char ch = board[i][j];

                if(ch !='.'){
                    if((!visited.add(ch+"exist in row"+i)) ||
                            (!visited.add(ch+"exist in col"+j)) ||
                                    (!visited.add(ch+"exist in 3*3 matix"+i/3+j/3)) )
                                    return true;

                }
            }
        }
        return false;
    }
}
