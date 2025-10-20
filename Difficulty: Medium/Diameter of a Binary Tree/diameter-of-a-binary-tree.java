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
} */

class Solution {
    public int diameter(Node root) {
        // code here
        Help h = fun(root);
        return h.diameter;
    }
    public Help fun(Node root)
    {
        if(root == null) return new Help();
        Help l = fun(root.left);
        Help r = fun(root.right);
        Help h = new Help();
        h.height = Math.max(l.height , r.height) + 1;
        h.diameter = Math.max(Math.max(l.diameter , r.diameter) , l.height + r.height);
        return h;
    }
}
class Help{
    int height;
    int diameter;
    Help()
    {
        height = 0;
        diameter = 0;
    }
}