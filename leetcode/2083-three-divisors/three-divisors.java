class Solution {
    public boolean isThree(int n) {
        if(n==1)
        return false;
        int count = 0;
        int i =1;
        while(i<=n)
        {
            if(n%i==0)
            count++;
            i++;
        }
        return count==3?true:false;
    }
}