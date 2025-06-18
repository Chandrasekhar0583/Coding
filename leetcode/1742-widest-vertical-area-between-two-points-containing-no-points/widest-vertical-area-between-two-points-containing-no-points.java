class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points , (n1 , n2) -> Integer.compare(n1[0] , n2[0]));
        int max = Integer.MIN_VALUE;
        for(int i = 1 ; i < points.length ; i++)
        {
            if(points[i][0] == points[i-1][0])
                continue;
            else
                max = Math.max( points[i][0] - points[i - 1][0] , max);
        }
        return max == Integer.MIN_VALUE? 0 : max;
    }
}