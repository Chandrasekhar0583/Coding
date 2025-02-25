class Solution {
    public void nextPermutation(int[] nums) {
       int pivot = -1;
       int n = nums.length-1;
       for(int i =n-1 ;i>=0;i--)
       {
        if(nums[i+1]>nums[i])
        {
            pivot = i;
            break;
        }
       }
       if(pivot==-1)
       Arrays.sort(nums);
       else{
        for(int i=n ;i>=pivot ;i--)
        {
            if(nums[i]>nums[pivot])
            {
                int x = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = x;
                break;
            }
        }
        Arrays.sort(nums,pivot+1,n+1);
       }
    }
}