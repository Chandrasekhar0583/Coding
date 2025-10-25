/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     Help h = fun(root , p , q);
        return h.ans;
    }
    public Help fun(TreeNode root , TreeNode p , TreeNode q)
    {
        if(root == null) return new Help();
        Help l = fun(root.left , p , q);
        Help r = fun(root.right , p , q);
        Help node = new Help();
        if(l.ans != null)
        return l;
        else if(r.ans != null)
        return r;
        node.p = (l.p || r.p || root == p);
        node.q = (l.q || r.q || root == q);
        if(node.p && node.q){ node.ans = root;}
        return node;

    }
}
class Help{
    boolean p  , q;
    TreeNode ans;
    Help()
    {
        p = false;
        q=false;
        ans = null;
    }
}