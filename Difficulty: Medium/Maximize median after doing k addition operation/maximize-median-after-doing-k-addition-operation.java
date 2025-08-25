class Solution {
    public int maximizeMedian(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int res = arr[n/2];
        boolean flag = false;
        if(n % 2 == 0)
        {
            res += arr[(n/2) - 1];
            res /= 2;
          flag = false;
        }
        else{
            flag = true;
        }
        int low = res ;
        int high =res + k ;
        while( low <= high)
        {
            int mid = (low + high) / 2;
            // System.out.println(mid + " " + fun(arr , s , mid , k));
            if(fun(arr , n / 2 , mid , k , flag))
            {
                
                res = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return res;
    }
    public boolean fun(int arr[] , int i , int mid , int k , boolean flag)
    {
       if(!flag)
       {
           if(arr[i] <= mid)
           {
               k -= (mid - arr[i]);
               k -= (mid - arr[i - 1]);
           }
           else{
               
               k -= ((2 * mid )- (arr[i] + arr[i - 1]));
           }
           i++;
       }
       else{
           if(mid >= arr[i])
           {
               k -= mid - arr[i];
           }
           i++;
       }
       while(i < arr.length)
       {
           if(arr[i] < mid)
           k -= (mid - arr[i]);
           i++;
           if(k < 0) return false;
       }
        
        return k >= 0;
    }
}
