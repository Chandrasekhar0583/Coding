class Solution {
    int mod = 1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        long res[] = new long[n];
        for(int i = 0 ; i < n ; i++){
            res[i] = nums[i];
        }
        for(int arr[] : queries){
            int l = arr[0];
            int r = arr[1];
            int x = arr[2];
            while(l <= r){
                res[l] = (res[l] * arr[3] ) % mod;
                l += x;
            }
        }
        long x = res[0];
        for(int i = 1 ; i < n ; i++ ){
            x ^= res[i];
        }
        return (int)x;
    }
}