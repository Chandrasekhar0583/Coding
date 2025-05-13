class Solution {
    public int maxScore(int[] a, int k) {
        int max = 0;
        int pref2 = 0;
        int n = a.length;
        for(int i = 0 ; i < k ; i++)
        {
            pref2 += a[n - 1 - i];
        }
         int s1 = 0;
        int s2 = 0;
        max = pref2;
        for(int i = 0 ; i < k ; i++)
        {
             s1 += a[i];
             s2 += a[n - k + i];
            max = Math.max(max , s1+pref2 - s2);
        }
        return max;
    }
}