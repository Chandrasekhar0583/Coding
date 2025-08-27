class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int res[] = new int[n];
        for(int i =2 * n - 1 ; i >= 0 ; i--)
        {
            while(!stk.isEmpty() && stk.peek() <= nums[i%n])
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                res[i%n] = -1;
            }
            else{
                res[i%n] = stk.peek();
            }
            stk.push(nums[i%n]);
        }
        return res;
    }
}