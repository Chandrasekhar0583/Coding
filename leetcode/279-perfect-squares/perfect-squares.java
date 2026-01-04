class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> list = square(n);
        int dp[][] = new int[list.size() + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = Integer.MAX_VALUE / 2;
        }
        dp[0][0] = 0;
        for (int i = 1; i <= list.size(); i++) {
            dp[i][0] = Integer.MAX_VALUE / 2;
            for (int j = 0; j <= n; j++) {
                int non = dp[i - 1][j];

                int pick = Integer.MAX_VALUE / 2;
                if (j >= list.get(i - 1)) {
                    pick = 1 + dp[i][j - list.get(i - 1)];
                }
                dp[i][j] = Math.min(non, pick);
            }
        }
        return dp[list.size()][n];
    }

    public ArrayList<Integer> square(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            li.add(i * i);
        }
        return li;
    }
}