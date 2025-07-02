package recursion.hard;

public class wordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(searchNext(board, word, 0, m, n, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean searchNext(char[][] board, String word, int index, int m, int n, int row,
    int col) {
        if(index == word.length()) {
            return true;
        }

        if(row < 0 || col < 0 || row == m || col == n || board[row][col] != word.charAt(index)
        || board[row][col] == '!') {
            return false;
        }

        char ch = board[row][col];
        board[row][col] = '!';

        boolean top = searchNext(board, word, index + 1, m, n, row - 1, col);
        boolean bottom = searchNext(board, word, index + 1, m, n, row + 1, col);
        boolean left = searchNext(board, word, index + 1, m, n, row, col - 1);
        boolean right = searchNext(board, word, index + 1, m, n, row, col + 1);

        board[row][col] = ch;

        return top || bottom || left || right;
    }
}
