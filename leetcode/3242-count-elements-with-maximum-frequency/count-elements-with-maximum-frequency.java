class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int res = 0 , ele = -1, count = 0;
        for(int i : nums)
        {
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        for(Integer i : map.values())
        {
          if(i > ele)
          {
            ele = i;
            count = 1;
          }
          else if(ele == i)
          {
            count++;
          }
        }
        return ele * count;
    }
}