class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double maxDiagonal = 0;

        for (int[] a : dimensions) {
            double diagonal = (double)Math.sqrt((long)a[0] * a[0] +(long) a[1] * a[1]);
            // System.out.println(diagonal +" "+maxDiagonal);
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea =  a[0] * a[1];
            }
            else if(diagonal == maxDiagonal){
                maxArea = Math.max(maxArea , a[0] * a[1]);
            }
        }
        return maxArea;
    }
}
