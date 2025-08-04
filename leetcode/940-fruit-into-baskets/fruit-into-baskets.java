class Solution {
    public int totalFruit(int[] arr) {
        int i = 0 , j = 0;
        int res = 0;
        HashMap<Integer , Integer > map = new HashMap<>();
        int n = arr.length;
        int sum = 0;
        while(j < n)
        {
            map.put(arr[j] , map.getOrDefault(arr[j] , 0 ) + 1);
            sum++;
            while(map.size() > 2)
            {
                int x = map.get(arr[i]);
                if(x == 1)
                map.remove(arr[i]);
                else{
                    map.put(arr[i] , x - 1);
                }
                sum--;
                i++;
            }
            res = Math.max(res , sum);
            j++;
        }
        return res;
    }
}