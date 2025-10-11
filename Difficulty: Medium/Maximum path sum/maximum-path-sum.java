/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int findMaxSum(Node root) {
        // code here
        int res[] = {root.data};
        int r= fun(root , res);
        return res[0];
    }
    public int fun(Node root , int res[])
    {
        if(root == null)
        {
            return 0;
        }
        int l = Math.max( 0 , fun(root.left , res));
        int r = Math.max( 0 , fun(root.right , res));
        res[0] = Math.max(res[0] , l + r + root.data);
        return root.data+Math.max(l , r);
    }
}