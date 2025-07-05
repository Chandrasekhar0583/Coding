class Solution {
    public int maxSum(int arr[]) {
        // code here
        int sum = 0 ;
        int res = 0;
        sum = arr[0]+arr[1];
        res = sum;
        for(int i = 0 ; i < arr.length - 2 ; i++)
        {
            sum -= arr[i];
            sum += arr[i + 2];
            res = Math.max(res , sum);
        }
        return res;
    }
}