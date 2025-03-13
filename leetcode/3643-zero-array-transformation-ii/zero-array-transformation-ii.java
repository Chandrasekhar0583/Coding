class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
       int low = 0;
       int high = queries.length;
       int k = -1;
       if(Arrays.equals(nums,new int[n]))
       return 0;
       while(low<=high)
       {
        int mid = (low+high)/2;
        if(cansolve(mid,queries,nums.clone()))
        {
            k = mid ;
            high= mid-1;
        }
        else
        {
            low= mid+1;
        }
       }
       return k;
    }
    public boolean cansolve(int k , int[][] queries,int[] nums)
    {
        int n = nums.length;
        int diff[] = new int[n+1];
        for(int i =0 ;i<k;i++)
        {
            int a[] = queries[i];
            diff[a[0]] += a[2];
            diff[a[1]+1] -=   a[2];     
             }
             for(int i = 0 ;i<n;i++)
             {
                if(i==0)
                {
                    nums[i]-=diff[i];
                }
                else{
                    diff[i] += diff[i-1];
                    nums[i] -= diff[i]; 
                }
                if(nums[i]>0)
                return false;
             }
             return true;
    }
}