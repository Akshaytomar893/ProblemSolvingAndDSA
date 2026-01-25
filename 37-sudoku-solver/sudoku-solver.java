class Solution {
    private boolean isValidPosition(int row, int col, char digit, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit)
                return false;
            if (board[i][col] == digit)
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == digit)
                return false;
        }
        return true;
    }

    private boolean findSudokuSolution(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char digit = '1'; digit <= '9'; digit++) {
                        if (isValidPosition(row, col, digit, board)) {
                            board[row][col] = digit;
                            if (findSudokuSolution(board)) {
                                return true;
                            } else {
                                board[row][col] = '.';
                            }
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        findSudokuSolution(board);
    }
}