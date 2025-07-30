class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0 ;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
            int target = sum - k;
            if(map.containsKey(target))
            {
                count += map.get(target);
            }
            if(sum == k)
            count++;
            map.put(sum ,map.getOrDefault(sum , 0) + 1);
        }
        return count;
    }
}
