class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int luffy = 0; luffy <= grid.length - 3; luffy++) {
            for (int zoro = 0; zoro <= grid[0].length - 3; zoro++) {
                int[][] merry = new int[3][3];
                for (int sanji = 0; sanji < 3; sanji++) {
                    for (int nami = 0; nami < 3; nami++) {
                        merry[sanji][nami] = grid[luffy + sanji][zoro + nami];
                    }
                }
                if (isMagicSquare(merry)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagicSquare(int[][] merry) {
        int[] strawHats = new int[9];
        int index = 0;
        for (int luffy = 0; luffy < 3; luffy++) {
            for (int zoro = 0; zoro < 3; zoro++) {
                strawHats[index++] = merry[luffy][zoro];
            }
        }
        
        for (int num = 1; num <= 9; num++) {
            boolean found = false;
            for (int i = 0; i < strawHats.length; i++) {
                if (strawHats[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        int rowSum1 = merry[0][0] + merry[0][1] + merry[0][2];
        int rowSum2 = merry[1][0] + merry[1][1] + merry[1][2];
        int rowSum3 = merry[2][0] + merry[2][1] + merry[2][2];
        int colSum1 = merry[0][0] + merry[1][0] + merry[2][0];
        int colSum2 = merry[0][1] + merry[1][1] + merry[2][1];
        int colSum3 = merry[0][2] + merry[1][2] + merry[2][2];
        int diagSum1 = merry[0][0] + merry[1][1] + merry[2][2];
        int diagSum2 = merry[0][2] + merry[1][1] + merry[2][0];
        return rowSum1 == rowSum2 && rowSum2 == rowSum3 &&
               colSum1 == colSum2 && colSum2 == colSum3 &&
               diagSum1 == diagSum2 && rowSum1 == diagSum1;
    }
}
