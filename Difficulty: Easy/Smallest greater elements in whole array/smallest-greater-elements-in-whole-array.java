// User function Template for Java

// User function Template for Java

// User function Template for Java

class Complete {

    // Function for finding maximum and value pair
    public static int[] greaterElement(int arr[], int n) {
        // Complete the function
        int res[] = new int[n];
        int store[] = new int[n];
        for(int i = n - 1 ; i >= 0 ; i--)
        {
           store[i] = arr[i];
        }
        Arrays.sort(store);
        for(int i = 0 ; i < n ; i++)
        {
            res[i] = find(store , arr[i]);
        }
        return res;
    }
    public static int find(int arr[] , int x)
    {
        int mid = 0;
        int low = 0 , high = arr.length - 1;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(arr[mid] == x ){
                if(mid == arr.length - 1 || x != arr[mid + 1]) 
                break;
                else
                low = mid + 1;
            }
            else if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return mid == arr.length - 1 ? -10000000 : arr[mid + 1];
    }
}
