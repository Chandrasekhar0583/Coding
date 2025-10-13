/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    int maxDiff(Node root) {
        //  code here
        Help h = fun(root);
        return h.ans;
    }
    Help fun(Node root)
    {
        if( root == null ) return new Help();
        
        Help l = fun(root.left);
        Help r = fun(root.right);
        
        Help h = new Help();
        if(l.min == Integer.MAX_VALUE && r.min == Integer.MAX_VALUE)
        {
            h.min = Math.min(root.data , l.min);
        }
        else if(l.min == Integer.MAX_VALUE)
        {
            h.ans = Math.max(r.ans , root.data - r.min);
            h.min = Math.min(r.min , root.data);
        }
        else if(r.min == Integer.MAX_VALUE)
        {
            h.ans = Math.max(l.ans , root.data - l.min);
            h.min = Math.min(l.min , root.data);
        }
        else{
            h.ans = Math.max(Math.max(l.ans , r.ans) , root.data - Math.min(l.min , r.min));
            h.min = Math.min(root.data ,Math.min(l.min , r.min));
        }
        return h;
    }
}
class Help{
    int min;
    int ans;
    Help()
    
    {
        min = Integer.MAX_VALUE;
        ans = Integer.MIN_VALUE;
    }
}