class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        int n = points.length;
        for(int i = 0 ; i < n - 2; i++ )
        {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j = i + 1 ; j < n - 1 ; j++ )
            {
                 int x2 = points[j][0];
                 int y2 = points[j][1];
                for(int k = j + 1 ; k < n ; k++)
                {
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    double r1 = x1 * ( y2 - y3 );
                    double r2 = x2 * ( y3 - y1 );
                    double r3 = x3 * ( y1 - y2 );
                    double res = 0.5 * Math.abs( r1 + r2 + r3 );
                    area = Math.max(area , res);
                }
            }
        }
        return area;
    }
}