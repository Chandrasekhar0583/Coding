class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int temp1 = Integer.MIN_VALUE;
        int temp2 = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        int count1=0,count2=0;
        for(int i:nums)
        {
            if(temp2!=i && count1==0)
            {
                count1++;
                temp1 = i;
            }
            else if(temp1 == i)
            {
                count1++;
            }
            else if(temp1!=i && count2==0)
            {
                count2++;
                temp2 = i;
            }
            else if(temp2==i)
            count2++;
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i:nums)
        {
            if(i==temp1)
            count1++;
            else if(temp2==i)
            count2++;
        }
        if(count1>(nums.length)/3)
        list.add(temp1);
        if(count2>(nums.length)/3)
        list.add(temp2);
        return list;
    }
}