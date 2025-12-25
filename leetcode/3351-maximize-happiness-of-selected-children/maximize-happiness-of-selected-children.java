class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : h)
        {
            pq.add(i);
        }
        long res = 0;
        for(int i = 0 ; i < k ; i++ )
        {
            int x = pq.poll();
            if(x - i > 0)
            {
                res += x - i;
            } 
            else{
                break;
            }
        }
        return res;
    }
}