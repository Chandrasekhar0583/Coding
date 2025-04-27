class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0 ;
        for( int  i = 0 ; i <= nums.length - 3 ; i++ )
        {
            int x = nums [i] + nums[i + 2];
            if( nums[ i + 1 ]  == 2 * x )
            {
                count++;
            }
        }
        return count;
    }
}