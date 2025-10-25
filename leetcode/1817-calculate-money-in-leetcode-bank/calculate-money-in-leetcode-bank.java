class Solution {
    public int totalMoney(int n) {
        int q = n / 7;
        int r = n % 7;
        int sum = 0;
        for(int i = 0 ; i < q ; i++)
        {
            int x = 7 + i;
            int s1 = (x + 1) * x / 2;
            int y = i * (i + 1)/2;
            sum += (s1 - y);
        }
        int x = r + q;
        int s1 = (x + 1) * x / 2;
        int y = q * (q + 1) / 2 ;
        // System.out.println(y);
        sum += (s1 - y);
        return sum;
    }
}