class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        for(int i = 0 ; i < n; i++)
        {
            arr[i * 2] = nums[i]; 
            arr[i* 2 + 1] = nums[n + i];
        }
        return arr;
    }
}