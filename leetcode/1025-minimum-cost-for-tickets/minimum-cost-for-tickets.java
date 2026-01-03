class Solution {
    int n;
    int dp[];

    public int mincostTickets(int[] days, int[] costs) {
        n = days.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return fun(0 , days , costs);
    }
    public int fun(int ind , int days[] , int costs[]){
        if(ind == n) return 0;

        if(dp[ind] != -1) return dp[ind];

        int c1 = costs[0] + fun(ind + 1 , days , costs);

        int j = ind ;

        while(j < n && days[j] < days[ind] + 7){
            j++;
        }
        int c2 = costs[1] + fun(j , days , costs);
        j = ind ;

        while(j < n && days[j] < days[ind] + 30){
            j++;
        }
        int c3 = costs[2] + fun(j , days , costs);

        return dp[ind] = Math.min(c1 , Math.min(c2 , c3));
    }
}