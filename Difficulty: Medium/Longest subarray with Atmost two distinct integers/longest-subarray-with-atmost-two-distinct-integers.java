class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer , Integer > map = new HashMap<>();
        int i = 0 , j = 0;
        int n = arr.length;
        int max = 0;
        while( j < n )
        {
            map.put(arr[j] , map.getOrDefault(arr[j] , 0 ) + 1);
            while(map.size() > 2 && i < j)
            {
                if(map.get(arr[i]) == 1)
                {
                    map.remove(arr[i]);
                }
                else{
                    map.put(arr[i] , map.get(arr[i]) - 1);
                }
                i++;
            }
            max = Math.max(max , j - i + 1);
            j++;
        }
        return max;
    }
}