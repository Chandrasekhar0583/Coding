class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[101];
        int count = 0;
        for(int i : nums)
        {
            if ( i > k )
            {
                if(arr[i] == 0)
                {
                    arr[i] = 1;
                    count++;
                }
            }
            else if(i < k)
            return -1;

        }
        return count;
    }
}