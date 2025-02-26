class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int prefix = arr[0];
        int odd = 0,even = 0;
        int result = 0;
        if (prefix % 2 == 0)
            even++;
        else {
            result++;
            odd++;
        }
        for (int i = 1; i < arr.length; i++) {
            prefix += arr[i];
            if (prefix % 2 == 0) {
                result = (result+odd)%1000000007;
                even++;
            } else {
                result = (result+even+1)%1000000007;
                odd++;
            }
        }
        return (result)%1000000007;
    }
}