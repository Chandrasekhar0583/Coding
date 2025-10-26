// User function Template for Java

class Solution {

    public static long minSum(int arr[], int n) {
        // Your code goes here
        Arrays.sort(arr);
        long r1 = 0;
        long r2 = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i % 2 ==0 )
            {
                r1 = r1 * 10 + arr[i];
            }
            else{
                r2 = r2 * 10 + arr[i];
            }
        }
        return r1 + r2;
    }
}