/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public int count = 0, ele = -1;
    public int kthSmallest(Node root, int k) {
        // code here
        if(root == null)
        return 0;
        count = 0;
        ele = -1;
        fun(root , k);
        return ele;
    }
    public void fun(Node root , int k)
    {
        if(root == null) return ;
        fun(root.left , k);
        count++;
        if(count == k) ele = root.data;
        fun(root.right , k);
    }
}