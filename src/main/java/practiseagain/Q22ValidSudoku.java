package practiseagain;

import java.util.HashSet;
import java.util.Set;

public class Q22ValidSudoku {
    public static void main(String[] args) {
        char[][] validSudoku = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] invalidSudoku = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'}, // '8' duplicated in same column
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, // '8' duplicated in first column
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoKu(validSudoku));
        System.out.println(isValidSudoKu(invalidSudoku));
    }

    public static boolean isValidSudoKu(char[][] board) {
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (!visited.add(ch + "row" + i)
                            || !visited.add(ch + "col" + j)
                            || !visited.add(ch + "3*3 board"+i/3+"-"+j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
