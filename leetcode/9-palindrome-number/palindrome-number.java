class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        else{
            int tem=x;
            int s=0;
            while(x!=0)
            {
                int r=x%10;
                s=s*10+r;
                x=x/10;
            }
            if(s==tem)
            return true;
            else
            return false;
        }
    }
}