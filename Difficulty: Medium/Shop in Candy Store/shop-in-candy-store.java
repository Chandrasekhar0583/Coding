class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(prices);
        int i = 0 , n = prices.length;
        int j = n - 1;
        int sum = 0;
        while(i <= j)
        {
            sum += prices[i];
            j -= k;
            i++;
        }
        res.add(sum);
        sum = 0;
        i = 0 ; j = n - 1;
        while( i <= j )
        {
            sum += prices[j];
            j--;
            i += k;
        }
        res.add(sum);
        return res;
        
    }
}
