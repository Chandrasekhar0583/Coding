class Solution {
    public int lastRemaining(int n) {
        boolean flag = true;
        return find(n , flag);
    }
    public int find(int n , boolean flag)
    {
        if(n == 1)
        return 1;
        if(flag || n % 2 == 1)
        {
            return  (2 *   find(n/2 , !flag)) ;
        }
        else{
           
            return  (2 *   find(n/2 , !flag) - 1) ;
        }
    }
}