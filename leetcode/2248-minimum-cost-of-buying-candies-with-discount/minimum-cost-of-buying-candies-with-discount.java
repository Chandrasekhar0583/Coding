class Solution {
    public int minimumCost(int[] cost) {
        int res = 0;
        Arrays.sort(cost);
        int n = cost.length;
        for (int i = n - 1; i >= 0; i--) {
            res += cost[i];
            
            i--;
            
            if (i >= 0) {
                res += cost[i];
                i--; 
            }
            
        }
        return res;
    }
}