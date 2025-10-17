/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

class Solution {
    public static int sum = 0;
    public static void transformTree(Node root) {
        // code here
        sum = 0;
    fun(root);
    return ;
    }
    public static void fun(Node root)
    {
        if(root == null) return ;
         fun(root.right);
        int data = root.data;
        root.data = sum;
        sum += data;
        fun(root.left);
        return ;
        
    }
}