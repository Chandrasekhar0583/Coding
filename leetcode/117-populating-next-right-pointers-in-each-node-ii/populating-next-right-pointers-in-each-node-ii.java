/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        ArrayList<Node> q = new ArrayList<>();
        if(root == null) return null;
        q.add(root);
        while(!q.isEmpty())
        {
            int x = q.size();
            int i = 0;
            while( i < x )
            {
                Node temp = q.remove(0);
                if( temp.left != null)
                {
                    q.add(temp.left);
                }
                if( temp.right != null )
                {
                    q.add(temp.right);
                }
                if(i == x - 1 || q.size() == 0 )
                {
                    temp.next = null;
                }
                else{
                    temp.next = q.get(0);
                }
                i++;
            }
        }
        return root;
    }
}