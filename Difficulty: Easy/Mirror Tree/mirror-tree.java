

// User function Template for Java

// function Template for Java

// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        fun(node);
    }
    public void fun(Node n)
    {
        if(n==null)
        return ;
        Node temp=n.left;
        n.left=n.right;
        n.right=temp;
        fun(n.right);
        fun(n.left);
    }
}