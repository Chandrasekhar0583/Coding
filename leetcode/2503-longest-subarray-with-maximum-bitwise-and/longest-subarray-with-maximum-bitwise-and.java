class Solution {
    public int longestSubarray(int[] nums) {
        int x=nums[0],c=0,m=0;
        for(int i=1;i<nums.length;i++)
        x=Math.max(nums[i],x);
        for(int i=0;i<nums.length;i++)
        {
               int t= nums[i]&x;
                if(t==x)
                m++;
                else 
           { c=Math.max(c,m);
           m=0;}
        }
        c=Math.max(c,m);
        return c;
    }
}