/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}781
*/

class Solution {
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        fun(root , list);
        int ind = -1;
        int low = 0;
        int high = list.size() - 1;
        ArrayList<Integer> res = new ArrayList<>();
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(list.get(mid) <= target)
            {
                ind = mid;
                low = mid + 1;
            }
            else if(list.get(mid) > target)
            {
                
                high = mid -1;
            }
        }
        high = ind + 1;
        while(res.size() < k)
        {
            int x =ind >= 0 ? list.get(ind) : Integer.MAX_VALUE;
            int y =high < list.size() ? list.get(high) : Integer.MAX_VALUE;
            if(Math.abs(x - target) <= Math.abs(y - target))
            {
                res.add(x);
                ind--;
            }
            else{
                res.add(y);
                high++;
            }
            
        }
        return res;
    }
    public void fun(Node root , ArrayList<Integer> list)
    {
        if(root == null) return ;
        fun(root.left , list);
        list.add(root.data);
        fun(root.right , list);
    }
}