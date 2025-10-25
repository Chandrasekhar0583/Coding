/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    boolean flag ;
    Node prev;
    public boolean isBST(Node root) {
        // code here
        prev = null;
        flag = true;
        fun(root);
        return flag;
    }
    public void fun(Node root)
    {
        if(root == null) return ;
        fun(root.left);
        
        if(prev != null)
        {
            if(prev.data > root.data)
            {
                flag = false;
            }
        }
        
        prev = root;
        fun(root.right);
    }
}