package apreparingforinterview;

import java.util.HashSet;
import java.util.Set;

public class ValidSuduku {

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                          ,{'6','.','.','1','9','5','.','.','.'}
                          ,{'.','9','8','.','.','.','.','6','.'}
                          ,{'8','.','.','.','6','.','.','.','3'}
                          ,{'4','.','.','8','.','3','.','.','1'}
                          ,{'7','.','.','.','2','.','.','.','6'}
                          ,{'.','6','.','.','.','.','2','8','.'}
                          ,{'.','.','.','4','1','9','.','.','5'}
                          ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));

    }
        public static boolean isValidSudoku(char[][] board) {
            Set<String> visited = new HashSet<>();

            for(int i=0; i<9;i++){
                for(int j=0; j<9;j++){
                    char char_val = board[i][j];
                    if(char_val != '.'){
                        if(!visited.add(char_val+"is exist in row"+i) ||
                                (!visited.add(char_val+"is exist in col"+j)) ||
                                (!visited.add(char_val+"is exist in 3*3 matrix"+i/3+j/3)))
                            return false;
                    }
                }
            }
            return true;
        }
    }

