import java.util.Stack;

class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        
        int[] lmin = new int[n];
        lmin[0] = nums[0];
        for (int i = 1; i < n; i++) {
            lmin[i] = Math.min(lmin[i - 1], nums[i]);
        }
        
        Stack<Integer> stack = new Stack<>();
        for (int j = n - 1; j >= 0; j--) {
           if(nums[j]>lmin[j])
           {
            while(!stack.isEmpty() && stack.peek()<=lmin[j])
            {
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()<nums[j])
            return true;


            stack.push(nums[j]);
           }
        }
        return false;
    }
}
