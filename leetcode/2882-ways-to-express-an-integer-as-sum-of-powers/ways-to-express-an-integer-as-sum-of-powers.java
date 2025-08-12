class Solution {
    public final int mod = 1000000007;
    public int numberOfWays(int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while(Math.pow(i , x) <= n)
        {
            list.add((int)Math.pow(i , x));
            i++;
        }
        int dp[][] = new int[list.size()][n + 1];
        for(i = 0 ; i < list.size() ; i++)
        {
            Arrays.fill(dp[i] , -1);
        }
           return check(list , list.size() - 1 , n , dp) %mod;
    }
    public int check(ArrayList<Integer> list , int i , int target , int dp[][])
    {
        if(i == 0 && target == 0) return 1;
        if(target == 0) return 1;
        if(target < 0 || i < 0) return 0;
        if(dp[i][target] != -1)
        return dp[i][target];
        int x = 0;
        if(list.get(i) <= target)
        x = check(list , i - 1 , target - list.get(i) , dp) % mod;
        x += check(list , i - 1 , target , dp) % mod;
        return dp[i][target] = x % mod;
        
    }
}