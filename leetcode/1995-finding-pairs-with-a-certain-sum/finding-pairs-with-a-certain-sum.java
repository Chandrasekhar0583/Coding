class FindSumPairs {
    int arr2[];
    public HashMap<Integer , Integer> map = new HashMap<>();
    public HashMap<Integer , Integer> map1 = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr2 = new int[nums2.length];
        for(int i = 0 ; i < nums1.length ; i++)
        {
            map1.put(nums1[i] , map1.getOrDefault(nums1[i] , 0 ) + 1);
        }
        for(int i = 0 ; i < nums2.length ; i++ )
        {
            arr2[i] = nums2[i];
            map.put(arr2[i] , map.getOrDefault(arr2[i] , 0 ) +1);
        }
    }
    
    public void add(int index, int val) {
        int x = arr2[index];
        arr2[index] += val;
            map.put(arr2[index] ,  map.getOrDefault(arr2[index] , 0) + 1);
        if(map.containsKey(x)){
        if(map.get(x) == 1)
        {
            map.remove(x);
        }
        else{
            map.put(x , map.get(x) - 1);
        }}
    }
    public int count(int tot) {
        int count = 0;
        for(Map.Entry<Integer, Integer> m1 : map1.entrySet())
        {
            int target = tot - m1.getKey();
            if(target >= 0 && map.containsKey(target))
            {
                count += map.get(target) * m1.getValue();
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */