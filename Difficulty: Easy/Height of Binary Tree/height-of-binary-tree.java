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
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        Point p = find(  node);
        return p.height - 1;
    }
    public Point find( Node node )
    {
        if( node == null )
            return new Point();
        Point newPoint = new Point();
        Point left = find(node.left);
        Point right = find(node.right);
        newPoint.height = Math.max(left.height , right.height ) + 1;
        return newPoint;
    }
}
class Point{
    int height ;
    Point(){
        height = 0;
    }
}