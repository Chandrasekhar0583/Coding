class Solution {
    public long flowerGame(int n, int m) {
        long e = 0,e1 = 0;
        long o = 0, o1 = 0;
        if(m % 2 == 0)
        {
            e = m / 2;
            o = m / 2;
        }
        else{
            e = m / 2;
            o = m / 2 + 1;
        }
        if(n % 2 == 0)
        {
            e1 = n / 2;
            o1 = n / 2;
        }
        else{
            e1 = n / 2;
            o1 = n / 2 + 1;
        }
        return (o1 * e) + (e1 * o);
    }
}