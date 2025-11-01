// User function Template for Java

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < n ; i++ )
            {
                Node node = q.poll();
                max = Math.max(max , node.data );
                if(node.left != null)
                {
                    q.add(node.left);
                }
                if(node.right != null)
                {
                    q.add(node.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}