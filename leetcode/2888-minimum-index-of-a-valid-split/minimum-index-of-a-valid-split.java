class Solution {
    public int minimumIndex(List<Integer> nums) {
        int ele = nums.get(0);
        int count = 1;
        int n = nums.size();
        for(int i = 1;i<n;i++)
        {
            if(ele==nums.get(i))
            count++;
            else
            count--;
            if(count ==0)
            {
                ele = nums.get(i);
                count =1;
            }
        }
        count = 0;
        for(Integer i : nums)
        {
            if(i==ele)
            count++;
        }
        int c1=0;
        for(int i =0;i<n;i++)
        {
            if(nums.get(i)==ele)
            c1++;
            if(c1*2>i+1 && (count-c1)*2>(n-(i+1)))
            return i;
            
        }
        return -1;
    }
}