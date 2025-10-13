/*
class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public int getMaxSum(Node root) {
        // code here
        int arr[] = fun(root);
        return Math.max(arr[0] , arr[1]);
    }
    public int[] fun(Node root)
    {
        if(root == null) return new int[]{0 , 0};
        
        int left[] = fun(root.left);
        int right[] = fun(root.right);
        
        int inclu = root.data + left[1] + right[1];
        int exclu = Math.max(left[0] , left[1]) + Math.max(right[0] , right[1]);
        return new int[]{inclu , exclu};
    }
}