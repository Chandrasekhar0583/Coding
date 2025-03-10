class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int len = n+k-1 ;
        int arr[] = new int[len];
        for(int i=0;i<n;i++)
        {
            arr[i] = colors[i];
        }
        for(int i=0;i<k-1;i++)
        {
            arr[n+i] = colors[i];
        }
        int count = 0;
        int left = 0;
        for (int i = 0; i <len; i++) {
            if (i>0 && arr[i] == arr[i - 1]) {
                left = i;
                }
            if(i-left +1>=k)
            {
                count++;
            }

            }    
        return count;
    }
}