class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int a[] = new int[n - k + 1];
        int l = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int i = 0;
        int sum = 0;
        int j = 0;
        while(j < n)
        {
            map.put(nums[j] , map.getOrDefault(nums[j] , 0) + 1);
            sum += nums[j];
            if(j - i >= k)
            {
                sum -= nums[i];
                if(map.get(nums[i]) == 1)
                {
                    map.remove(nums[i]);
                }
                else{
                    map.put(nums[i] , map.get(nums[i]) - 1);
                }
                i++;
            }
            if(j - i + 1 == k)
            {
                if(map.size() > x){
                ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
                Collections.sort(list , (e1 , e2)->{
                    int cmp = Integer.compare(e2.getValue() , e1.getValue());
                    if(cmp == 0)
                    {
                         cmp = Integer.compare(e2.getKey() , e1.getKey());

                    }
                    return cmp;
                });
                int s = 0;
                for(int m = 0 ; m < x ; m++)
                {
                    s += list.get(m).getKey() * list.get(m).getValue();
                }
                a[l++] = s;
                }
                else{
                    a[l++] = sum;
                }
            }
            j++;
        }
        return a;
    }
}