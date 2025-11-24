class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long res = 0;
        List<Boolean> list = new ArrayList<>();
        for(int i : nums)
        {
            res = (2 * res + i ) % 5;
            if(res % 5 == 0)
            {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}