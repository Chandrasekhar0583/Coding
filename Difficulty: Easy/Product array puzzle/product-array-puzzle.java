

// User function Template for Java

class Solution {
    public static int[] productExceptSelf(int nums[]) {
        // code here
        int[] res=new int[nums.length];
        long c=0,mul=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
                continue;
            }
            mul=mul*nums[i];
        }
        if(c==0)
        {
            for(int i=0;i<nums.length;i++)
            {
                res[i]=(int)mul/nums[i];
            }
        }
        else if(c==1)
        {
             for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                res[i]=(int)mul;
                else
                res[i]=0;
            }
        }
        else
        Arrays.fill(res,0);
        return res;
    }
}
