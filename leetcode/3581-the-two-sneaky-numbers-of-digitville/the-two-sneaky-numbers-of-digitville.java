class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[] = new int[101];
        int res[] = new int[2];
        for(int i: nums)
        {
            arr[i]++;
        } int k = 0;
        for(int i = 0 ; i < 101 ; i++)
        {
            if(arr[i] == 2)
            {
                res[k++] = i;
            }
        }
        return res;
    }
}