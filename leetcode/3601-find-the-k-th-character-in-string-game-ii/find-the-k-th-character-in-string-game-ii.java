class Solution {
    public char kthCharacter(long k, int[] arr) {
        long count = 0;
        int n  = arr.length,i;
        long pow = 1;
        for( i = 0 ; i <= n ; i++)
        {
            pow = (1L << i);
            if(pow >= k)
            break;
        }
        count = fun( pow - (pow - k) , arr , i , pow);
        return (char)('a' + (count % 26));
    }
    public long fun(long k , int[] arr , int ind , long pow)
    {
        if(ind == 0 || k == 1)
        {
            return 0;
        }
        if(k == 1)
        {
            return arr[0];
        }
        long half = pow /2;
        if(k <= half)
        {
            return fun( k , arr , ind - 1 , half);
        }
        return arr[ind  - 1] + fun( k - half , arr , ind - 1 ,half);
    }
}