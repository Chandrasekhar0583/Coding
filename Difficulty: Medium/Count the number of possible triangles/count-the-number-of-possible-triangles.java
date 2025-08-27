class Solution {
    public int countTriangles(int arr[]) {
        // code here
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0 ; i < n - 2 ; i++)
        {
            for(int j = i + 1 ; j < n - 1 ; j++)
            {
                int low = j+1;
                int high = n - 1;
                int res = j;
                int mid = (low + high) / 2;
                while(low <= high)
                {
                    mid = (low + high) / 2;
                    if(arr[mid] < (arr[i] + arr[j]))
                    {
                        res = mid;
                        low = mid +1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
                // System.out.println(i+" "+j+" "+res);
                count += res - j;
            }
        }
        return count;
    }
}