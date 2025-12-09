class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int nums[] = new int[1000000];
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr)
        {
            if(nums[i] == 1)
            {
                set.add(i);
            }
            nums[i] = 1;
        }
        return new ArrayList<Integer>(set);
    }
}