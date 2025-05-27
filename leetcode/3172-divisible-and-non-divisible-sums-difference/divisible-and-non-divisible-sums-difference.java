class Solution {
    public int differenceOfSums(int n, int m) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if( i % m == 0 )
            count2 += i;
            else
            count1 += i;
        }
        return count1 - count2;
    }
}