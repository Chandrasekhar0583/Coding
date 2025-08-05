class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n = f.length;
        int res[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j <n;j++)
            {
                if(res[j] == 0 && b[j] >= f[i])
                {
                    res[j] = 1;
                    break;
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(res[i] == 0)
            count++;
        }
        return count;
    }
}