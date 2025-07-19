

class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1 ;
        long sum = ((long)n * ( n + 1)) / 2;
        long sum2 = 0;
        for( int i : arr )
        {
            sum2 += i;
        }
        return (int)(sum - sum2);
    }
}