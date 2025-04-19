class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++ )
        {
            int low = i + 1;
            int high = nums.length -1 ;
            int ind = -1;
            while(low <= high)
            {
                int mid = (low + high) /2;
                int x = nums[i] + nums[mid];
                if( lower <= x)
                {
                    high = mid - 1;
                    ind = mid;
                }
                else{
                    low = mid + 1;
                }
            }
            if( ind != -1)
            {
                int low2 = ind;
            int high2 = nums.length -1 ;
            int ind2 = -1;
            while(low2 <= high2)
            {
                int mid = (low2 + high2) /2;
                int x = nums[i] + nums[mid];
                if( upper >= x)
                {
                    low2 = mid + 1;
                    ind2 = mid;
                }
                else{
                    high2 = mid - 1;
                }
            }
            // System.out.println(ind +" "+ind2);
            if(ind2 != -1)
            count += ind2 - ind + 1;
            }
        }
        return count;
    }
}