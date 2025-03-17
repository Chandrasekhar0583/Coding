class Solution {
    public boolean divideArray(int[] nums) {
        int arr[] = new int[501];
        for(int i = 0;i<nums.length;i++)
        {
            arr[nums[i]] ^=1;
        }
        for(int i :arr)
        {
            if(i!=0)
            return false;
        }
        return true;
    }
}