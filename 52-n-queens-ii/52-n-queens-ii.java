class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean [n][n];
        return queens(board, 0);
    }
    
    static int queens(boolean[][] board, int row) {
            if (row == board.length) {
                return 1; 
            }
            int count = 0;

// Placing the queen for every row and column and checking that the place is safe or not

            for (int col = 0; col < board.length; col++) {
                // place the queen if, it is safe
                if (isSafe(board, row, col)) {
                    board[row][col] = true;
                    count += queens(board, row + 1);
                    board[row][col] = false;
                }
            }
            return count;

    }

//  check for every directio of the queen [vertical row, diagonal left, diagonal right]
    static boolean isSafe(boolean[][] board, int row, int col) {

        // vertical Row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Diagonal Left
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Diagonal Right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }
}