class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;
        for(int i : arr)
        {
            pq.add(i);
        }
        while(pq.size() > 1)
        {
            int x = pq.poll();
            int y = pq.poll();
            sum += x + y;
            pq.add(x + y);
        }
        return sum;
    }
}