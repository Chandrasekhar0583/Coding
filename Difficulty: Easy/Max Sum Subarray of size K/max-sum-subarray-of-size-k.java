class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        int res = 0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        res = sum;
        for(int i=0;i<arr.length-k;i++)
        {
            sum -= arr[i];
            sum+= arr[i+k];
            res = Math.max(res,sum);
        }
        return res;
    }
}