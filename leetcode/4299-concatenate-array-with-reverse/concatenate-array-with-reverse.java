class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int len = 2 * n - 1;
        int arr[] = new int[len + 1];
        for(int i = 0 ; i < n ; i++){
            arr[i] = nums[i];
            arr[len - i] = nums[i];
        }
        return arr;
    }
}