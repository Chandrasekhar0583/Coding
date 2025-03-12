class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        if(nums[0]==0 && nums[n-1]==0)
        {return 0;}
        if(nums[0]>0 || nums[nums.length-1]<0)
        return nums.length;
        int low=0,high=n-1;
        int left=-n,right=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>=0)
            high=mid-1;
            else 
            {
                 left=mid;
                low=mid+1;
            }
        }
        low=left;
        high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<=0)
            low=mid+1;
            else
            {
                right=mid;
                high=mid-1;
            }
        }
        return left+1>n-right?left+1:n-right;

    }
}