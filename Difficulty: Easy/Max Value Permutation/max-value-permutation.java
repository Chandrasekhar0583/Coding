// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        long sum = 0;
        int MOD = 1000000007 ;
        for (int i = 0; i < arr.length ; i++) {
            sum = (sum +  (1L * i * arr[i]) % MOD) % MOD;
        }

        return (int) sum;
    }
}
