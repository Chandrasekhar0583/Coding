class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int res = 0 ;
        int i = 0 ;
        int j = arr.length - 1;
        while(i < j)
        {
            res = Math.max(res ,Math.min(arr[i],arr[j]) * (j - i));
            if(arr[i] < arr[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
}