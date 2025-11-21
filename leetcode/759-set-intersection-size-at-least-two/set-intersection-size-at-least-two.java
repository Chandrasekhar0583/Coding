class Solution {
    public int intersectionSizeTwo(int[][] inter) {
        Arrays.sort(inter,(a,b) ->{
            if(a[1] < b[1]) return -1;
            else if(b[1] < a[1]) return 1;
             return Integer.compare(b[0] , a[0] );
        });
        // System.out.println(Arrays.deepToString(inter));
        int res = 2;
        int x = inter[0][1] - 1;
        int y = inter[0][1];
        for(int i = 1 ; i < inter.length ; i++)
        {
            int a = inter[i][0];
            int b = inter[i][1];
            if(x >= a && y >= a ) continue;
            else if(y >= a )
            {
                x = y;
                y = b;
                res += 1;
            }
            else{
                res += 2;
                x = b - 1;
                y = b;
            }


        }
        return res;
    }
} 