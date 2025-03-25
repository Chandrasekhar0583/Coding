class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int m = nums.length;
        int[] arr = new int[m];
        Arrays.fill(arr,-1);
        for(int i =0;i<m;i++)
        {
            if(arr[index[i]]==-1)
            arr[index[i]] = nums[i];
            else{
                for(int j=m-1;j>index[i];j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[index[i]] = nums[i];
            }
        }
        return arr;
    }
}