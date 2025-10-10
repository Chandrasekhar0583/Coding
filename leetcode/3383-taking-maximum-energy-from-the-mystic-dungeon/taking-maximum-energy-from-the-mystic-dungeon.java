class Solution {
    public int maximumEnergy(int[] arr, int k) {
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            if(i + k < n)
            {
                arr[i] += arr[i+k];
            }
            res = Math.max(res , arr[i]);
        }
    return res;
    }
}