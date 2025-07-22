class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int i = 0 , j = 0 ;
        int n = arr.length;
        for( i = 0 ; i < n ; i++)
        {
            if(arr[i] == i + 1)
            continue;
            else if(arr[i] < 1 || arr[i] > n)
            continue;
            else{
                int t = arr[i];
                if(arr[t - 1] == t){
                continue;
                }
                else{
                arr[i] = arr[t - 1];
                arr[t - 1] = t;
                    i--;
                }
            }
        }
        for( i = 0 ; i < n ; i++)
        {
            if(arr[i] != i + 1)
            return i+1;
        }
        return n+1;
    }
}
