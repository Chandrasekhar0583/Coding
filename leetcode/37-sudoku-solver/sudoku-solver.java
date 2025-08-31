class Solution {
    public void solveSudoku(char[][] board) {
        int def[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    def[i][board[i][j] - '1'] = 2;
                }
            }
        }

        boolean f = find(board, def, 0, 0);
        // return board;
    }

    public boolean find(char[][] b, int[][] d, int i, int j) {

        if (i == 9) {
            return true;
        } else if (i < 9 && j == 9) {
            return find(b, d, i + 1, 0);
        }
        if (b[i][j] != '.')
            return find(b, d, i, j + 1);
        for (int k = 1; k <= 9; k++) {
            if (d[i][k - 1] != 1 && d[i][k - 1] != 2) {

                if (row(b, k, i) && col(b, k, j) && box(b, k, i / 3 * 3, j / 3 * 3) && d[i][k - 1] == 0) {
                    d[i][k - 1] = 1;
                    b[i][j] = (char) (k + (int) '0');
                    if (find(b, d, i, j + 1)) {
                        return true;
                    } else {
                        d[i][k - 1] = 0;
                        b[i][j] = '.';
                    }
                }
            }
        }

        return false;
    }

    public boolean row(char b[][], int k, int i) {
        for (int j = 0; j < 9; j++) {
            if (b[i][j] != '.' && b[i][j] - '0' == k)
                return false;
        }
        return true;
    }

    public boolean col(char b[][], int k, int j) {
        for (int i = 0; i < 9; i++) {
            if (b[i][j] != '.' && b[i][j] - '0' == k)
                return false;
        }
        return true;
    }

    public boolean box(char b[][], int k, int i, int j) {
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 3; m++) {
                if (b[i + l][j + m] != '.' && b[i + l][j + m] - '0' == k)
                    return false;
            }
        }
        return true;
    }
}