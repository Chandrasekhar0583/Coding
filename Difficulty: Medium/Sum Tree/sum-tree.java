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
}
*/
class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        Help h = fun(root);
        return h.flag;
        
    }
    Help fun(Node root)
    {
        if(root == null) return new Help();
        Help l = fun(root.left);
        Help r = fun(root.right);
        Help h = new Help();
        if(root.left == null && root.right == null)
        {
            h.sum = root.data;
        }
        else if(root.left == null )
        {
                h.sum = root.data+r.sum;
            if(root.data != r.sum)
            {
                h.flag = false;
            }
        }
        else if(root.right == null)
        {
            h.sum = root.data + l.sum;
            if(root.data != l.sum )
            {
                h.flag = false;
            }
        }
        else{
            h.sum = root.data + l.sum + r.sum;
            if(root.data != l.sum + r.sum)
            {
                h.flag = false;
            }
        }
        h.flag = h.flag && l.flag && r.flag;
        return h;
        
    }
}
class Help{
    int sum;
    boolean flag;
    Help()
    {
        sum = 0;
        flag = true;
    }
}