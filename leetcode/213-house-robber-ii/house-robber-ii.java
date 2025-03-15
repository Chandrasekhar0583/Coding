class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        int x1 = cal(nums,0,n-2);
        int x2 = cal(nums,1,n-1);
        return Math.max(x1,x2);
    }
    public int cal (int[] nums,int s ,int e)
    {
        int val1=0;
        int val2 =0;
        for(int i =s ;i<=e ;i++)
        {
            int newval = Math.max(val1+nums[i],val2);
            val1 = val2;
            val2 = newval;
        }
        return val2;
    }
}