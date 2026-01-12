class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int x = points[0][0];
        int y = points[0][1];
        int n = points.length;
        for(int a[] : points){
            int r = 0;
            if(x > a[0] && y > a[1]){
                r = -1;
            }
            else if(x < a[0] && y < a[1]){
                r = 1;
            }
            int i = Math.abs(x - a[0]) ;
            int j = Math.abs(y - a[1]) ;
            if(i <= j){
                res += i;
                res += Math.abs(j - i);
            }
            else{
                res += j;
                res += Math.abs(j - i);
                // res += j - i;
            }
            x = a[0];
            y = a[1];
        }
        return res;
    }
}