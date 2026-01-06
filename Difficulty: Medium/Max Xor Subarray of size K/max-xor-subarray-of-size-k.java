class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length ;
        int xor = 0;
        for(int i = 0 ; i < k ; i++){
            xor ^= arr[i];
        }
        int ans = xor;
        for(int i = k ; i < n ; i++){
            xor ^= arr[i - k];
            xor ^= arr[i];
            ans = Math.max(ans , xor);
        }
        return ans;
    }
}
