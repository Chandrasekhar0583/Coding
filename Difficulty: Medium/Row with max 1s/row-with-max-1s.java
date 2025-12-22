// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int res = -1;
        int max = 0;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            int c = 0;
            for(int j : arr[i])
            {
                if(j == 1) c++;
            }
            if(c > 0 && c > max)
            {
                res = i;
                max = c;
                
            }
        }
        return res;
    }
}