
class Solution {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.') {
                    if (set.contains(board[j][i])) {
                        return false;
                    }
                    set.add(board[j][i]);
                }
            }
        }
        // Check all 9 boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char num = board[boxRow + i][boxCol + j];

                        if (num != '.') {
                            if (set.contains(num)) {
                                return false;
                            }
                            set.add(num);
                        }
                    }
                }
            }
        }
        return true;

    }
}
