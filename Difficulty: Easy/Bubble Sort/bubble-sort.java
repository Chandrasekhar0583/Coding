
// User function Template for Java

class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        for(int i=0 ;i<arr.length ; i++)
        {
            for(int j = i+1 ; j<arr.length ;j++)
            {
                if(arr[i]>arr[j])
                {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
    }
}

