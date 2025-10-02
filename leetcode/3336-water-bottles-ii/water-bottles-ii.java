class Solution {
    public int maxBottlesDrunk(int n, int e) {
        int res = n;
        while( n >= e)
        {
            n -= e;
            n++;
            e++;
            res++;  
        }
        return res;
    }
}