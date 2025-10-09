/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        fun(root , res);
        return res;
    }
    public void fun(Node root , ArrayList<Integer> res)
    {
        if(root == null) return ;
        fun(root.left , res);
        fun(root.right , res);
        res.add(root.data);
    }
}