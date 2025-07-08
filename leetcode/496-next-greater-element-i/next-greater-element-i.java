class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int len = nums2.length;
        HashMap<Integer , Integer > map = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[n];
        for(int i = len - 1 ; i>=0 ; i--)
        {
            int x = nums2[i % len];
            while(!stk.isEmpty() && stk.peek() <= x)
            {
                stk.pop();
            }
            if(!stk.isEmpty() && stk.peek() > x)
            {
                map.put(x , stk.peek());
            }
            else{
                map.put(x , -1);
            }
            stk.push(x);
        }
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}