class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int v1 = -1,v2 = 1, l , r;
        if(n % 2 == 0)
        {
            l = n /2 - 1;
            r = n/2;
        }
        else{
            arr[n/2] = 0;

         l = n/2 - 1 ;
          r = n/2 +1;
        }
        while(l >= 0 && r < n)
        {
            arr[l] = v1--;

            arr[r] = v2++;
            l--;
            r++;
        }
        return arr;
    }
}