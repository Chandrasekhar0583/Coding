class Solution {
    public String findDifferentBinaryString(String[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        int len = nums[0].length();
        int len1 = len;
        String end ="";
        while(len-->0)
        {
            end+=1;
        }
        for(String s : nums)
        {
            set.add(Integer.parseInt(s,2));
        }
        int c = 0;
        for(Integer i : set)
        {
            if(i!=c)
            return String.format("%"+len1+"s",Integer.toBinaryString(c)).replace(' ','0');
            c++;
        }
        return end;
    }
}