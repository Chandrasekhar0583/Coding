class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i = 0 ; i < n ; i++)
        {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int j = 0 ; 
            int k = i;
            while(k < n && j < n)
            {
                pq.add(grid[k][j]);
                k++;
                j++;
            }
            j = 0;
            k = i;
            while(k < n && j < n)
            {
                grid[k][j] = pq.poll();
                k++;
                j++;
            }
        }
        for(int k = 1 ; k< n ; k++)
        {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        int j = k;
       while(i < n && j < n)
            {
                pq.add(grid[i][j]);
                i++;
                j++;
            }
            j = k;
            i = 0;
            while(i < n && j < n)
            {
                grid[i][j] = pq.poll();
                i++;
                j++;
            }
        }
        return grid;
    }
}