class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int low = x;
        int high = x + k - 1;
        while(low < high){
            int j = y;
            while(j < y + k){
                int temp =  grid[low][j];
                grid[low][j] = grid[high][j];
                grid[high][j] = temp;
                j++;
            }
            low++;
            high--;
        }
        return grid;
    }
}