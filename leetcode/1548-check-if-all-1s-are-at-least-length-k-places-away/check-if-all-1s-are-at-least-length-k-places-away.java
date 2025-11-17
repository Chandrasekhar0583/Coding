class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int ind = -1;
        for(int i = 0 ; i < nums.length ; i++)
        { 
            if(nums[i] == 1)
            {
                if(ind == -1)
                {
                    ind  = i;
                }
                else if(i - ind - 1 >= k)
                {
                    ind = i;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}