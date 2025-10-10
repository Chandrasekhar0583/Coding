/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty())
        {
            int n = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int  i = 0 ; i < n ; i++)
            {
                Node x = q.poll();
                temp.add(x.data);
                if(x.left != null) q.add(x.left);
                if(x.right != null) q.add(x.right);
            }
            if(flag)
            {
               for(int i = temp.size() - 1 ; i>= 0 ; i--)
               
               {
                   res.add(temp.get(i));
               }
            }
            else{
               for(int i = 0 ; i < temp.size() ; i++)
               
               {
                   res.add(temp.get(i));
               }
                
            }
            flag = !flag;
        }
        return res;
    }
}