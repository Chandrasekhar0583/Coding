class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int res = 0;
        int i = 0, j = 0;
        int n = arr.length;
        int count = 0;
        while(j < n)
        {
            if(arr[j] == 0) count++;
            while(count > k && i <= j)
            {
                if(arr[i] == 0)
                count--;
                i++;
            }
            res = Math.max(res , j - i + 1);
            j++;
        }
        return res;
    }
}