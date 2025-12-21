class Solution {
    public long maximumScore(int[] nums, String s) {
        long res =  0;
        int n = nums.length;
        char arr[] = s.toCharArray();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < n ; i++)
        {
            pq.add(nums[i]);
            if(s.charAt(i) == '1')
            {
                // System.out.println(pq.peek());
                res += pq.poll();
            }
        }
        return res;
    }
}