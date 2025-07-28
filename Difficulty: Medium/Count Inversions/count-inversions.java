class Solution {
    // public static int count = 0;
    static int inversionCount(int arr[]) {
        // Code Here
        // count = 0;
        return mergeSort(arr , 0 , arr.length - 1);
    }
    public static int mergeSort(int[] arr , int low , int high)
    {
        int count = 0;
        if(low >= high)
        {
            return 0;
        }
            int mid = (low + high) /2;
            count += mergeSort(arr , low , mid);
            count += mergeSort(arr , mid + 1 ,high);
            count += merge(arr , low ,mid , high);
            return count;
    }
    public static int merge(int arr[] ,int low , int mid, int high)
    {
        int l = mid - low + 1;
        int r = high - mid;
        int left[] = new int[l];
        int right[] = new int[r];
        int count = 0;
        for(int i = low ; i<= mid ; i++)
        {
            left[i -low] = arr[i];
        }
        for(int i = mid + 1 ;  i <= high; i++)
        {
            right[i - mid - 1] = arr[i];
        }
        int i = 0 ,  j = 0;
        while(i < l && j < r)
        {
            if(left[i] <= right[j])
            {
                arr[low++] = left[i];
                i++;
            }
            else{
                count += l - i;
                arr[low++] = right[j];
                j++;
            }
        }
        while(i < l)
        {
            arr[low++] = left[i];
            i++;
        }
        while(j < r)
        {
            arr[low++] = right[j];
            j++;
        }
        return count;
    }
}