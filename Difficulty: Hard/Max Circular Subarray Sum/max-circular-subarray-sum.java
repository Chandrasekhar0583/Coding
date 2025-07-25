class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int tsum = 0;
        int max = arr[0];
        int min = arr[0];
        int curMin =0;
        int curMax = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            curMax = Math.max(curMax+ arr[i] , arr[i]);
            max = Math.max(max , curMax);
            
            curMin = Math.min(curMin + arr[i] , arr[i]);
            min = Math.min(min , curMin);
            
            tsum += arr[i];
        }
        // System.out.println(tsum +" "+min);
        if(tsum == min)
        return max;
        return Math.max(max , tsum - min);
    }
}
