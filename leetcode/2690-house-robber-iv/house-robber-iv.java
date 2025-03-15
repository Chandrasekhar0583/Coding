class Solution {
    public int minCapability(int[] nums, int k) {
        int low = nums[0];
        int high = nums[0];
        for(int i : nums)
        {
            if(low>i)
            low = i;
             if(high<i)
             high = i;
        }
        int res = 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(can(nums,mid,k))
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return res;
    }
    public boolean can(int nums[], int key , int k)
    {
        int count =0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]<=key){
            count++;
            i++;
        }
        }
        return count>=k;
    }
}