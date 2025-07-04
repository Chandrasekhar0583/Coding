class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();
        int low = 0 ;
        int high = 0;
        int count = 0 ;
        int n = arr.length;
        while(high < n)
        {
            map.put(arr[high] , map.getOrDefault(arr[high] , 0 ) + 1);
            while(low < high && map.size() > k)
            {
                if(map.get(arr[low]) == 1)
                {
                    map.remove(arr[low]);
                }
                else{
                    map.put(arr[low] , map.get(arr[low]) - 1);
                }
                low++;
            }
            count += high - low + 1;
            high++;
            
        }
        return count;
    }
}
