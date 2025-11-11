class Solution {
    public int maxProfit(int arr[]) {
        // Code here
        int n = arr.length;
        Integer dp[][] = new Integer[ n + 1][2];
        
        int x = fun(arr , dp , 0 , 0 );
        return x;
    }
    public int fun(int arr[] , Integer dp[][] , int i , int buy)
    {
        if(i >= arr.length) return 0;
        
        if(dp[i][buy] != null ) return dp[i][buy];
        
        if(buy == 0)
        {
            int pick = -arr[i] + fun(arr , dp , i + 1 , 1);
            
            int skip = fun(arr , dp , i + 1 , 0);
            
            dp[i][buy] = Math.max(skip , pick);
        }
        else{
            int pick = arr[i] + fun(arr , dp , i + 2 , 0);
            
            int skip = fun(arr , dp , i + 1 , 1);
            
            dp[i][buy] = Math.max(pick , skip);
        }
        return dp[i][buy];
    }
}
