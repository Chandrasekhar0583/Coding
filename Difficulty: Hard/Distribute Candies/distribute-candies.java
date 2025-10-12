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
}
*/

class Solution {
    public int distCandy(Node root) {
        // code here
        int a[] = new int[1];
        Help r = find(root , a);
        return r.ans;
    }
    public Help find(Node root ,int[] ans)
    {
        if(root == null) return new Help();
        
        Help l = find(root.left , ans);
        Help r = find(root.right , ans);
        Help h = new Help();
        h.ans = Math.abs(l.rem) + Math.abs(r.rem) + l.ans + r.ans;
        h.rem = root.data + l.rem + r.rem - 1;
        return h;
    }
}
class Help{
    int ans;
    int rem;
    Help()
    {
        ans = 0;
        rem = 0;
    }
}