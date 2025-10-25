class Solution {
    public int minOperations(int[] arr) {
        // code here
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i : arr)
        {
            pq.add((double)i);
            sum += i;
        }
        double s1 = sum;
        int count = 0;
        while(s1 > sum / 2)
        {
            count++;
            double x = pq.poll();
            s1 -= x;
            pq.add(x / 2.0);
            s1 += (x / 2.0);
        }
        return count;
    }
}