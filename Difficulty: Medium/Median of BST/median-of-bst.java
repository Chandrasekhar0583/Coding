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
}
*/
// 23 + 15 = 38 * 

class Solution {
    int ele = 0;
    public int findMedian(Node root) {
        // Code here
        int nodes = len(root);
        if(nodes % 2 == 0)
        {
            nodes /= 2;
        }
        else{
            nodes = (nodes + 1)/2;
        }
        ele = 0;
        return find(root ,nodes );
    }
    public int len(Node root)
    {
        if(root == null) return 0;
        return len(root.left )+len(root.right) + 1;
    }
    public int find(Node root , int n)
    {
        if(root == null )
        return -1;
        int l = find(root.left , n);
        if(l != -1) return l;
        ele++;
        if(ele == n) return root.data;
        int r = find(root.right , n);
        // if(r != -1) return r;
        return r;
        
    }
}