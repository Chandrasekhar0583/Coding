class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        while( low <= high)
        {
            int mid = (low + high )/2;
            if(nums[mid] > target)
            {
                high = mid -1;
            }
            else if (nums[mid] < target)
            {
                low = mid +1;
            }
            else{
                if(mid == 0 || nums[mid - 1] !=  nums[mid]){
                    index = mid;
                    break;
                }
                else{
                    high = mid -1;
                }
            }
        }
        if( index == -1)
        return new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for( int i = index ; i < nums.length ; i++)
        {
            if( nums[i] != target)
            break;
            res.add(i);
        }
        return res;
    }
}