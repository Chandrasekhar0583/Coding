class Solution {
    public int josephus(int n, int k) {
        // code here
        return fun(n , k) ;
    }
    public int fun(int n , int k)
    {
        if(n == 1)
        return 1;
        return (fun( n - 1 , k) + k - 1 ) % n + 1;
    }
}