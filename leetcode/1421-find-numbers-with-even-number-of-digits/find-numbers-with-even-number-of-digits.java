class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for( int i : nums )
        {
            int n = (int)(Math.log10(i)) + 1;
            if(n%2==0)
            count++;
        }
        return count;
    }
}