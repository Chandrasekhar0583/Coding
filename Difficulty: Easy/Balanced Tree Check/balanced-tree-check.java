/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        if(root == null) return true;
        
        return fun(root).flag;
        
    }
    public Help fun(Node root)
    {
        if(root == null) return new Help();
        
        Help l = fun(root.left);
        Help r = fun(root.right);
        
        if(!l.flag) return l;
        else if(!r.flag) return r;
        Help h = new Help();
        
        h.len = Math.max(l.len , r.len) + 1; 
        if(Math.abs(l.len - r.len) > 1) 
        {
            h.flag = false;
        }
        return h;
    }
}
class Help{
    int len;
    boolean flag ;
    public Help()
    {
        len = 0;
        flag = true;
    }
}