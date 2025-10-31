class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int ind = -1;
        int n = arr.length;
        for(int i = n - 2 ; i >= 0  ; i-- )
        {
            if(arr[i] < arr[i + 1])
            {
                ind = i;
                break;
            }
        }
        if(ind != -1){
        int max = -1;
        for(int i = n -1 ; i > ind ; i--)
        {
            if(arr[i]> arr[ind] )
            {
                max = i;
                break;
            }
        }
        int t = arr[max];
        arr[max] = arr[ind];
        arr[ind] = t;
            Arrays.sort(arr, ind + 1 , n);
        }
        else
        Arrays.sort(arr );
        
    }
}