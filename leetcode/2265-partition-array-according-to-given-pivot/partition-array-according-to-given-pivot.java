class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int count = 0;
        for(int i : nums)
        {
            if(i<pivot)
            {
                left.add(i);
            }
            else if(i>pivot)
            {
                right.add(i);
            }
            else
            count++;
        }
        int i=0;
        for(Integer j : left)
        {
            nums[i++] = j;
        }
        for(int j=0;j<count;j++)
        {
            nums[i++]=pivot;
        }
        for(Integer j : right)
        {
            nums[i++] = j;
        }
        return nums;
    }
}