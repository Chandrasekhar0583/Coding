class Solution {
    public boolean checkPowersOfThree(int n) {
        int x = n;
        while(x!=0)
        {
            int r = x%3;
            if(r==2)
            return false;
            x=x/3;
        }
        return true;
    }
}