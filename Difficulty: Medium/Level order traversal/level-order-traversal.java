/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            ArrayList<Integer> li = new ArrayList<>();
            for(int i = 0 ; i < n ; i++)
            {
                Node node = q.poll();
                li.add(node.data);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            res.add(li);
        }
        return res;
    }
}