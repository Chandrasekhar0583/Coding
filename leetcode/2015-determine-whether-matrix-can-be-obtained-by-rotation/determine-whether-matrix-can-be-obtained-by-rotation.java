class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        int c=0;
       for(int k=0;k<4;k++)
       {
         mat= rotate(mat,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    c++;
                    break;
                }
            }
        }
        if(c!=0)
            c=0;
        else
            return true;
       }
        return false;
    }
    public int[][] rotate(int[][] mat,int n)
    {
         for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int tem=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=tem;
            }
        }
        for(int i=0;i<n;i++)
        {
            int st=0;
            int end=n-1;
            while(st<end)
            {
                int tem=mat[i][st];
                mat[i][st]=mat[i][end];
                mat[i][end]=tem;
                st++;
                end--;
            }
        }
        return mat;
    }
}