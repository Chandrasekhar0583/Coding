class Solution {
    public int hIndex(int[] c) {
        // code here
        int n = c.length;
        int arr[] = new int[n + 1];
        for(int i = 0 ; i < n ; i++)
        {
            if(c[i] > n)
            {
                arr[n]++;
            }
            else{
                arr[c[i]]++;
            }
        }
        int s = arr[n];
        int ind = n ;
        while(s < ind)
        {
            ind--;
            s += arr[ind];
        }
        return ind;
    }
}