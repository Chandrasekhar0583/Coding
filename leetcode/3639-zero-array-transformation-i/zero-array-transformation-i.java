class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int def[] = new int[n+1];
        for(int i[] : queries)
        {
            def[i[0]]++;
            def[i[1]+1]--;
        }
        for(int i =0 ;i<n;i++)
        {
            if(i==0)
            nums[i]-=def[i];
            else{
                def[i]+=def[i-1];
                nums[i] -= def[i];
            }
            if(nums[i]>0)
            return false;
        }
        return true;
    }
}