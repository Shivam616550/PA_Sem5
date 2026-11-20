package Graph;

public class Surrounded_Regions_LC130 {
    public static void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) return;
        int rows = board.length;
        int cols = board[0].length;
        for (int row = 0; row < rows; row++) {
            markBorderConnected(board, row, 0);
            markBorderConnected(board, row, cols - 1);
        }
        for (int col = 0; col < cols; col++) {
            markBorderConnected(board, 0, col);
            markBorderConnected(board, rows - 1, col);
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O') board[row][col] = 'X';
                else if (board[row][col] == 'S') board[row][col] = 'O';
            }
        }
    }

    private static void markBorderConnected(char[][] board, int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || board[row][col] != 'O') return;
        board[row][col] = 'S';
        markBorderConnected(board, row + 1, col);
        markBorderConnected(board, row - 1, col);
        markBorderConnected(board, row, col + 1);
        markBorderConnected(board, row, col - 1);
    }

    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solve(board);
        for (char[] row : board) System.out.println(java.util.Arrays.toString(row));
    }
}
